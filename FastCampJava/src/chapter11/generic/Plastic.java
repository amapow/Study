package chapter11.generic;

public class Plastic extends Meterial{

    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic으로 프린트 합니다.");
    }
}
