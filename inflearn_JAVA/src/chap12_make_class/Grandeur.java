package chap12_make_class;

public class Grandeur {

    public String color;
    public String gear;
    public int price;

    public Grandeur() {
        // 생성자 : Class가 호출되면 가장 먼저 실행 되는 구문, Class명과 동일해야함.
        System.out.println("Grandeur constructor");
    }

    public void run() {
        System.out.println("-- run() --");
    }

    public void stop() {
        System.out.println("-- stop() --");
    }

    public void info() {
        System.out.println("-- info() --");
        System.out.println("color : " + color);
        System.out.println("gear : " + gear);
        System.out.println("price : " + price);
    }
}
