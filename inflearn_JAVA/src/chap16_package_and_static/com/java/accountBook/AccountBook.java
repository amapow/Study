package chap16_package_and_static.com.java.accountBook;

public class AccountBook {
    String name;
    static int amount = 0;

    public AccountBook(String name) {
        this.name = name;
    }

    public void addAmount(int amount) {
        this.amount += amount;
        System.out.println("amount : " + this.amount);
    }

    public void delAmount(int amount) {
        this.amount -= amount;
        System.out.println("amount : " + this.amount);
    }
}
