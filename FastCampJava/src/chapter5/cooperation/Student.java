package chapter5.cooperation;

public class Student {
    private String studentName;
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMoney() {
        return money;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

}
