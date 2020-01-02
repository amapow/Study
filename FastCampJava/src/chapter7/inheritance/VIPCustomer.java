package chapter7.inheritance;

public class VIPCustomer extends Customer {

    private int agentID;
    private double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "Silver";
        bonusRatio = 0.01;
        salesRatio = 0.1;
       // System.out.println("VIPCustom(int, String) 생성자 호출");
    }
//    public VIPCustomer() {
//
//        super(0, null);
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.01;
//
//        System.out.println("VIPCustomer() 생성자 호출");
//    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }


}
