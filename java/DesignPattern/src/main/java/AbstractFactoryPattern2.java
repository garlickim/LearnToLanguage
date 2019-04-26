public class AbstractFactoryPattern2 {
    public static void main(String[] args) {
        FactoryOfPersonFactory factoryOfPersonFactory = new FactoryOfPersonFactory();
        factoryOfPersonFactory.createPerson("Sally1");
    }
}

class FactoryOfPersonFactory{

    public void createPerson(String name){
        PersonFactory personFactory = null;

        if("Sally1".equals(name)){
            personFactory = new Sally1();
        } else if("Tom1".equals(name)){
            personFactory = new Tom1();
        }

        personFactory.wearClothes();
    }
}

interface PersonFactory{
    Wear wearClothes();
}

abstract class Wear{
}

class SallyWear extends Wear {
    public SallyWear(){
        System.out.println("Sally wears clothes");
    }
}

class TomWear extends Wear {
    public TomWear(){
        System.out.println("Tom wears clothes");
    }
}

class Sally1 implements PersonFactory{
    public SallyWear wearClothes() {
        return new SallyWear();
    }
}
class Tom1 implements PersonFactory{
    public TomWear wearClothes() {
        return new TomWear();
    }
}