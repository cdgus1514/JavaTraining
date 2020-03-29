package Chapter8.GameLevel;

public class MainBoardPlay {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.play(1);
        System.out.println();

        AdvancedLevel alevel = new AdvancedLevel();
        player1.upgradeLevel(alevel);
        player1.play(1);
        System.out.println();


        SuperLevel slevel = new SuperLevel();
        player1.upgradeLevel(slevel);
        player1.play(2);
        System.out.println();


        Player editor = new Player();
        UltraLevel ulevel = new UltraLevel();
        editor.upgradeLevel(ulevel);
        editor.play(5);
    }
}
