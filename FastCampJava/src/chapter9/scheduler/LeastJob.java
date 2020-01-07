package chapter9.scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("idle 상태인 상담원에게 할당합니다.");
    }
}
