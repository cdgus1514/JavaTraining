package Chapter8.Abstract;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("DeskTop Disply");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    // 상위클래스 메서드 재정의
    @Override
    public void turnOn() {
        System.out.println("Override desktop turnOn");
    }
}
