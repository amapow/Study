package chapter7.ex1;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

//    public Customer() {
//        customerGrade = "Silver";
//        bonusRatio = 0.01;
//
//        System.out.println("Custom() 생성자 호출");
//    }

    public Customer(int customerID, String customerName) {
        this.customerName = customerName;
        this.customerID = customerID;

        customerGrade = "Silver";
        bonusRatio = 0.01;
        //System.out.println("Custom(int, String) 생성자 호출");

    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showcustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }


    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }
}
