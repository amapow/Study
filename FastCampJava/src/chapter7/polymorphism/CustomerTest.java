package chapter7.polymorphism;

public class CustomerTest {

    public static void main(String[] args) {
        Customer silver = new Customer(1, "silver");
        Customer gold = new GoldCustomer(2, "gold");
        Customer VIP = new VIPCustomer(3, "vip");

        System.out.println("silver : " + silver.calcPrice(10000));
        System.out.println("gold : " + gold.calcPrice(10000));
        System.out.println("vip : " + VIP.calcPrice(10000));
    }
}
