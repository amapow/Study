package chapter7.inheritance;

public class OverridingTest {

    public static void main(String[] args) {

        Customer lee = new Customer(10010, "이순신");
        lee.setBonusPoint(1000);
        int priceLee = lee.calcPrice(10000);

        VIPCustomer kim = new VIPCustomer(10010, "김유신");
        kim.bonusPoint = 10000;
        int priceKim = kim.calcPrice(10000);

        System.out.println(lee.showcustomerInfo() + "lee's price " + priceLee);
        System.out.println(kim.showcustomerInfo() + "kim's price " + priceKim);

        Customer customerNo = new VIPCustomer(10030, "노홍철");
        customerNo.bonusPoint = 10000;
        System.out.println(customerNo.showcustomerInfo() + "kim's price " + customerNo.calcPrice(10000));

    }
}
