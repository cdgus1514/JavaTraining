package Chapter8.GameLevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("엄청 빨리 달리기");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프");
    }

    @Override
    public void turn() {
        System.out.println("회전");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------- 고급자 레벨입니다. -------");
    }
}
