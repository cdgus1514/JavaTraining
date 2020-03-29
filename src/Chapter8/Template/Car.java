package Chapter8.Template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동걸기");
    }

    public void turnOff(){
        System.out.println("시동끄기");
    }

    public void washCar(){}

    // 하위클래서에서 재정의 불가
    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();

        washCar();  // 하위 메서드에서 재정의 하면 실행되는 메서드
    }
}
