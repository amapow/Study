package chapter7.polymorphism;

public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "Gold";
        bonusRatio = 0.02;
        salesRatio = 0.05;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
