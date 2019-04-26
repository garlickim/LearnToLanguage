public class AbstractFactoryPattern {

    public static void main(String args[]) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("LG");
    }
}

class FactoryOfComputerFactory {
    public void createComputer(String type) {
        ComputerFactory computerFactory = null;
        if ("LG".equals(type)) {
            computerFactory = new LGComputerFactory();
        } else if ("Samsung".equals(type)) {//computerFactory = new SamsungComputerFactory();
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}


class LGComputerFactory implements ComputerFactory {
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

    public LGMouse createMouse() {
        return new LGMouse();
    }
}

class SamsungComputerFactory implements ComputerFactory {
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }
}

interface ComputerFactory {
    Keyboard createKeyboard();

    Mouse createMouse();
}


abstract class Keyboard {
}

class LGKeyboard extends Keyboard {
    public LGKeyboard() {
        System.out.println("LG 키보드 생성");
    }
}

class SamsungKeyboard extends Keyboard {
    public SamsungKeyboard() {
        System.out.println("Samsung 키보드 생성");
    }
}

abstract class Mouse {
}

class LGMouse extends Mouse {
    public LGMouse() {
        System.out.println("LG 마우스 생성");
    }
}

class SamsungMouse extends Mouse {
    public SamsungMouse() {
        System.out.println("Samsung 마우스 생성");
    }
}
