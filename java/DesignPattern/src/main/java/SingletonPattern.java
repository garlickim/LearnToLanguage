public class SingletonPattern {

    Car racingCar = Car.getCar();

}

class Car {

    /**
     * volatile : 멀티 스레딩환경에서 동기화를 해주는 키워드
     * 컴파일러가 특정 변수에 대해 옵티마이저가 캐싱을 적용하지 못하도록 하는 키워드
     * 따라서, 모든 스레드에 대해 특정 변수에 대한 항상 최신 값을 제공한다.
     *
     * **/
    private static volatile Car car = new Car();

    private Car() {

    }

    public static Car getCar(){
        return car;
    }

}