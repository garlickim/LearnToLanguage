import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExample {

    public static void main(String[] args){

        LamdaExample ex = new LamdaExample();

        // map test
        ex.lamdaMapExample();

        // filter, collect test
        ex.lamdaFilterExample();

        // reduce test
        ex.lamdaReduceExample();


    }

    public void lamdaMapExample(){
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        System.out.println("java 7");
        for(int num : numbers) {
            System.out.println(num*10);
        }

        System.out.println("\njava 8");
        numbers.stream()
                .map(num -> num*10)
                .forEach(num -> System.out.println(num));
    }

    public void lamdaFilterExample(){

        final List<String> strs = Arrays.asList("apple", "banana", "malon", "grape");

        List<String> result1 = new ArrayList<>();

        System.out.println("java 7");
        for (String str : strs) {
            if (str.contains("n")) {
                result1.add(str);
            }
        }
        System.out.println(result1);

        System.out.println("\njava 8");

        List<String> result2 = strs.stream().filter(str -> str.contains("n")).collect(Collectors.toList());

        System.out.println(result2);

    }

    public void lamdaReduceExample(){
        final List<Integer> numbers = Arrays.asList(200, 100, 150, 170);

        int result1 = 0;

        for (int num : numbers) {
            if(num != 170 && num > 150) {
                result1 = num;
            }
        }

        System.out.println("\njava 7 "+result1);

        int result2 = numbers.stream().reduce(170, (num1, num2) -> num1 != num2 && num2 > 150 ? num2 : num1 );

        System.out.println("java 8 "+result2);


    }

}
