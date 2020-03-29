package Chapter8.GameLevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달리기");
    }

    @Override
    public void jump() {
        System.out.println("사용 불가능");
    }

    @Override
    public void turn() {
        System.out.println("사용 불가능");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------- 초급자 레벨입니다. -------");
    }
}
