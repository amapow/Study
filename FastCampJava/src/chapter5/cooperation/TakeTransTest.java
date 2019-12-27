package chapter5.cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 10000);
        Student studentK = new Student("Kim", 20000);

        Bus bus100 = new Bus(100);
        Subway subway3 = new Subway(3);
        Taxi taxi1 = new Taxi("개인택시");

        for(int i = 0 ; i < 3 ; i++) {
            studentJ.takeBus(bus100);
            studentK.takeSubway(subway3);
        }
        studentK.takeTaxi(taxi1);
        studentJ.showInfo();
        studentK.showInfo();

        bus100.showInfo();
        subway3.showInfo();
        taxi1.showInfo();
    }
}
