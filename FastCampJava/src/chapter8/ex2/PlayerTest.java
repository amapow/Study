package chapter8.ex2;

public class PlayerTest {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);


        AdvancedLevel advenced = new AdvancedLevel();
        player.upgradeLevel(advenced);
        player.play(3);

        SuperLevel superL = new SuperLevel();
        player.upgradeLevel(superL);
        player.play(10);
    }
}
