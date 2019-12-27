package chapter5.cooperation;

public class Taxi {
    private int taxiNumber;
    private String typeOfTaxi;
    private int income;
    private int passengerCount;

    public Taxi(String typeOfTaxi) {
        this.typeOfTaxi = typeOfTaxi;
    }

    public void take(int money) {
        this.income += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("typeOfTaxi : " + typeOfTaxi);
        System.out.println("passenger : " + passengerCount);
        System.out.println("income : " + income);
    }
}
