package chapter10.ex1;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof MyDate) {
            MyDate date = (MyDate) obj;
            if(this.day == date.day) {
                if(this.month == date.month) {
                    if(this.year == date.year) {
                        return true;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
            else return false;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return day+month+year;
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate(10, 12, 2020);
        MyDate date2 = new MyDate(10, 12, 2020);

        System.out.println(date1.equals(date2));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
