package chapter8.ex2;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void showLevelMsg() {
        System.out.println("***** 초보자 레벨입니다. *****");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("초보자는 jump 못함");
    }

    @Override
    public void turn() {
        System.out.println("초보자는 turn 못함");
    }


}
