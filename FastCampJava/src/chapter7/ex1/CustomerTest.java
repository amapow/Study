package chapter7.ex1;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        Customer silver_1 = new Customer(1, "silver_1");
        Customer silver_2 = new Customer(2, "silver_2");

        Customer gold_1 = new GoldCustomer(3, "gold_1");
        Customer gold_2 = new GoldCustomer(4, "gold_2");

        Customer vip_1 = new VIPCustomer(5, "vip_1", 69);

        ArrayList<Customer> priceList = new ArrayList<Customer>();

        priceList.add(silver_1);
        priceList.add(silver_2);
        priceList.add(gold_1);
        priceList.add(gold_2);
        priceList.add(vip_1);
        System.out.println("============고객 정보============");
        for (Customer customer : priceList) {
            System.out.println(customer.showcustomerInfo());

        }

        System.out.println("============가격 정보============");
        for (Customer customer : priceList) {
            System.out.println(customer.calcPrice(10000));

        }
        System.out.println("============적립 후 고객 정보============");

        for (Customer customer : priceList) {
            System.out.println(customer.showcustomerInfo());

        }
    }
}
