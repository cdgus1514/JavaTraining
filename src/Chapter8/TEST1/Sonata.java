package Chapter8.TEST1;

public class Sonata extends Car {

    @Override
    public void drive() {
        System.out.println("Sonata 운전 시작");
    }

    @Override
    public void stop() {
        System.out.println("Sonata 정지");
    }

    @Override
    public void start() {
        System.out.println("Sonata 시동 걸기");
    }

    @Override
    public void turnOff() {
        System.out.println("Sonata 시동 끄기");
    }
}
