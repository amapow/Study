package chapter5.hiding;

public class MyDateTest {
    public static void main(String[] args) {
        MyDay day = new MyDay();
        day.setDate(1);
        day.setMonth(13);
        day.setYear(2020);
        day.showDate();

        MyDay day2 = new MyDay();
        day2.setYear(2019);
    }

}
