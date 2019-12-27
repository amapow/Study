package chapter5.hiding;

public class MyDay {
    private int year;
    private int month;
    private int date;
    boolean isValid = true;

    public void setDate(int date) {
        if(date > 31) {
            System.out.println("date insert error");
            isValid = false;
        }
        else this.date = date;
    }

    public void setMonth(int month) {
        if(month > 12 || month < 1) {
            System.out.println("month insert error");
            isValid = false;
        }
        else this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public void showDate() {
        if (isValid == true) {
            System.out.println(year + "년 " + month + "월 " + date + "일");
        }
        else System.out.println("check your insert");
    }
}
