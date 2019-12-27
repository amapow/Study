package chapter5.exam2;

public class CoffeTest {
        public static void main(String[] args) {
        Worker jung = new Worker("jung", 10000);
        Worker lee = new Worker("lee", 20000);
        jung.takeCoffe("starbucks", "americano");
        lee.takeCoffe("coffeebean", "latte");

    }
}
