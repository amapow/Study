package chapter5.exam1;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(31, 12, 2020);
        MyDate date2 = new MyDate(31, 4, 2020);
        MyDate date3 = new MyDate(11, 13, 2020);
        MyDate date4 = new MyDate(28, 2, 2020);
        System.out.println(date1.isValid());
        System.out.println(date2.isValid());
        System.out.println(date3.isValid());
        System.out.println(date4.isValid());
    }
}
