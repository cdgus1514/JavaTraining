package Chapter8.GameLevel;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("빨리 달리기");
    }

    @Override
    public void jump() {
        System.out.println("점프");
    }

    @Override
    public void turn() {
        System.out.println("사용 불가능");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------- 중급자 레벨입니다. -------");
    }
}
