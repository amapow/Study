package chapter8.template;

public abstract class  Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

//    시나리오가 정해져있는 template method final로 선언, 재정의 할 수 없다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
