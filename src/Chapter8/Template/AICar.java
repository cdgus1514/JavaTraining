package Chapter8.Template;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율주행 시작");
    }

    @Override
    public void stop() {
        System.out.println("AI 정지");
    }
}
