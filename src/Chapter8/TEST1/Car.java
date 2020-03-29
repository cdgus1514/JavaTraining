package Chapter8.TEST1;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void start(){
        System.out.println("시동걸기");
    }

    public void turnOff(){
        System.out.println("시동끄기");
    }


    // 하위클래서에서 재정의 불가
    final public void run(){
        start();
        drive();
        stop();
        turnOff();
    }
}
