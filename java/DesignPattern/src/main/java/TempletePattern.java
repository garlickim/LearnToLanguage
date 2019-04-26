public class TempletePattern {

    public static void main(String[] args) {

        Sally sally = new Sally();
        sally.readyToOutdoor();

        Tom tom = new Tom();
        tom.readyToOutdoor();

    }

}

abstract class Person {

    void readyToOutdoor() {

        wearGlasses();
        wearClothes();

        if (isTakeUmbrella()) {
            takeUmbrella();
        }

    }

    final void wearGlasses() {
        System.out.println("wear glasses");
    }

    abstract void wearClothes();

    boolean isTakeUmbrella() {
        return false;
    }

    void takeUmbrella() {

    }

}

class Sally extends Person {

    @Override
    void wearClothes() {
        System.out.println("Sally wears clothes");
    }

}

class Tom extends Person {
    @Override
    void wearClothes() {
        System.out.println("Tom wears clothes");
    }

    @Override
    boolean isTakeUmbrella() {
        return true;
    }

    @Override
    void takeUmbrella() {
        System.out.println("Tom take umbrella");
    }
}