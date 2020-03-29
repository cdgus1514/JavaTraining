package Chapter8.TEST1;

public class Grandeur extends Car {

    @Override
    public void drive() {
        System.out.println("Grandeur 운전 시작");
    }

    @Override
    public void stop() {
        System.out.println("Grandeur 정지");
    }

    @Override
    public void start() {
        System.out.println("Grandeur 시동 걸기");
    }

    @Override
    public void turnOff() {
        System.out.println("Grandeur 시동 끄기");
    }
}
