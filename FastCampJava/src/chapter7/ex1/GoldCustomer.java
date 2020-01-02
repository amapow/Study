package chapter7.ex1;

public class GoldCustomer extends Customer {

    private double salesRatio;
    private double bonusRatio;



    public GoldCustomer() {}

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "Gold";
        salesRatio = 0.1;
        bonusRatio = 0.02;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
