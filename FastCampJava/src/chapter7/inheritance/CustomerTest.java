package chapter7.inheritance;

public class CustomerTest {

    public static void main(String[] args) {

        Customer lee = new Customer(10010, "이순신");


//        lee.setCustomerID(10010);
//        lee.setCustomerName("이순신");
        lee.setBonusPoint(1000);

        System.out.println(lee.showcustomerInfo());

//        VIPCustomer kim = new VIPCustomer(10010, "유신");
        Customer kim = new VIPCustomer(10010, "김유신");
        kim.customerID = 10020;
        kim.setCustomerName("김유신");
        kim.setBonusPoint(10000);

        lee = kim;

        System.out.println(kim.showcustomerInfo());


    }
}
