package chapter5.exam1;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDate() {
        if (month < 1 || month > 12) {
            isValid = false;
        }
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                if(day < 1 || day > 31) {
                    isValid = false;
                }
                break;
            }
            case 2: {
                if(day < 1 || day > 28) {
                    isValid = false;
                }
                break;
            }
            case 4: case 6: case 9: case 11: {
                if(day < 1 || day > 30) {
                    isValid = false;
                }
                break;
            }
        }
    }

    public boolean isValid() {
        setDate();
        return isValid;
    }
}
