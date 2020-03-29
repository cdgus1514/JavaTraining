package Chapter8.GameLevel;

public class UltraLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("소닉");
    }

    @Override
    public void jump() {
        System.out.println("마이클 조던");
    }

    @Override
    public void turn() {
        System.out.println("팽이");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------- 운영자 레벨입니다. -------");
    }
}
