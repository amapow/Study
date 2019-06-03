package chap12_make_class;

public class main {
    public static void main(String[] args) {
        Grandeur myCar1 = new Grandeur();
        myCar1.color = "Red";
        myCar1.gear = "AT";
        myCar1.price = 300000;

        myCar1.run();
        myCar1.stop();
        myCar1.info();

        Grandeur myCar2 = new Grandeur();
        myCar2.color = "Yellow";
        myCar2.gear = "MT";
        myCar2.price = 500000;

        myCar2.run();
        myCar2.stop();
        myCar2.info();

        Bicycle myBicycle1 = new Bicycle();
        myBicycle1.color = "red";
        myBicycle1.price = 100;
        myBicycle1.info();

        Bicycle myBicycle2 = new Bicycle("Yellow", 300);
        myBicycle2.info();
        myBicycle2.color = "Blue";
        // 생성자 호출 이후에도 멤버의 값을 변경할 수 있다.
        myBicycle2.info();

    }
}