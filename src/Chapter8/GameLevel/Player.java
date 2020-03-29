package Chapter8.GameLevel;

public class Player {

    private PlayerLevel level;  // PlayerLevel을 상속받은 클래스는 모두 변수가 될 수 있음


    public Player(){
        level = new BeginnerLevel();    // 시작은 초급자
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }


    public PlayerLevel getLevel() {
        return level;
    }
}
