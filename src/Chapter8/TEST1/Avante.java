package Chapter8.TEST1;

public class Avante extends Car {

    @Override
    public void drive() {
        System.out.println("Avante 운전 시작");
    }

    @Override
    public void stop() {
        System.out.println("Avante 정지");
    }

    @Override
    public void start() {
        System.out.println("Avante 시동 걸기");
    }

    @Override
    public void turnOff() {
        System.out.println("Avante 시동 끄기");
    }
}
