package chapter8.ex2;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMsg();
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMsg();
    }



    public void play(int count) {
        level.go(count);

    }
}
