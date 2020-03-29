package Chapter8.Template;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("수동운전 시작");
    }

    @Override
    public void stop() {
        System.out.println("수동정지");
    }

    @Override
    public void washCar() {
        System.out.println("자동차 세차 🧺🧹");
    }
}
