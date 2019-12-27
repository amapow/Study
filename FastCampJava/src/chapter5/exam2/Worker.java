package chapter5.exam2;

public class Worker {
    private String worKerName;
    private int money;

    public Worker(String worKerName, int money) {
        this.worKerName = worKerName;
        this.money = money;
    }
    Cafe starbucks = new Cafe("별다방");
    Cafe coffeebean = new Cafe("콩다방");

    public void takeCoffe(String cafeName, String menuName) {
        if (cafeName.equals("starbucks")==true) {
            if(menuName.equals("americano")==true) {
                money = money - starbucks.sellingCoffee("americano");
                System.out.println(starbucks.latte.getMenuPrice() + "원으로 스타벅스 아메리카노를 구입했습니다.");
            } else if (menuName.equals("latte")==true) {
                money = money - starbucks.sellingCoffee("latte");
                System.out.println("스타벅스 라떼를 구입했습니다. 잔액은 " + money);
            }
            else System.out.println("입력에러");
        }
        else if(cafeName.equals("coffeebean")==true) {
            if(menuName.equals("americano")==true) {
                money = money - coffeebean.sellingCoffee("americano");
                System.out.println("커피빈 아메리카노를 구입했습니다. 잔액은 " + money);
            } else if (menuName.equals("latte")==true) {
                money = money - coffeebean.sellingCoffee("latte");
                System.out.println("커피빈 라떼를 구입했습니다. 잔액은 " + money);
            }
            else System.out.println("입력에러");
        }
        else System.out.println("입력에러");
    }
}
