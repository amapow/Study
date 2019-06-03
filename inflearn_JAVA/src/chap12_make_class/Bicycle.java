package chap12_make_class;
// 생성자
public class Bicycle {

    public String color;
    public int price;

    public Bicycle() {
        System.out.println(" Bicycle constructor");
    }

    public Bicycle(String c, int p) {
        //생성자 생성시에 객체의 멤버를 선언
        this.color = c;
        //해당 생성자의 멤버에 접근하는 this
        this.price = p;
        System.out.println(" Bicycle constructor");
    }

    public void info() {
        System.out.println(" -- info() -- ");
        System.out.println(" color : " + color );
        System.out.println(" price : " + price );
    }
}
