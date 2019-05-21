# Java를 컴파일하면 생기는 Class 파일에 $가 붙는 경우

* 해당 Java 파일에 inner class가 있는 경우에 $가 붙는다.

```java
public class Car {

    String type = "nomal";

    class Advantage {
        int speed = 100;
        int weight = 50;
    }
}
```

![title](/img/classFileName$.png)
