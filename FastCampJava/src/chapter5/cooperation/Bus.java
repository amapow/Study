package chapter5.cooperation;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int income = 0;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println("Bus numvber : " + busNumber);
        System.out.println("Passenger : " + passengerCount);
        System.out.println("Income : " + income);
    }
}
