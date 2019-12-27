package chapter5.cooperation;

public class Subway {
    private int lineNumber;
    private int passengerCount;
    private int income = 0;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    public int getlineNumber() {
        return lineNumber;
    }

    public void setlineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println("Line numvber : " + lineNumber);
        System.out.println("Passenger : " + passengerCount);
        System.out.println("Income : " + income);
    }
}
