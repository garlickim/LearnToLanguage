import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {
    public static void main(String[] args) {

        PhoneBook original_phonebook = new PhoneBook();
        original_phonebook.loadData();

        try {

            PhoneBook phoneBook = (PhoneBook) original_phonebook.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

class PhoneBook implements Cloneable {

    private List<String> phoneNumberList;

    public PhoneBook() {
        phoneNumberList = new ArrayList<>();
    }

    public PhoneBook(List<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public void loadData() {
        phoneNumberList.add("010 0123 1234");
        phoneNumberList.add("010 0124 1234");
        phoneNumberList.add("010 0125 1234");
        phoneNumberList.add("010 0126 1234");
    }

    public List<String> getPhoneNumberList() {
        return phoneNumberList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();

        for (String number : this.getPhoneNumberList()) {
            list.add(number);
        }

        return new PhoneBook(list);
    }
}
