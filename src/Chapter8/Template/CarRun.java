package Chapter8.Template;

public class CarRun {
    public static void main(String[] args) {

        Car car1 = new AICar();
        car1.run();
        System.out.println("===========================");

        Car car2 = new ManualCar();
        car2.run();
    }
}
