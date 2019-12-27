package chapter5.exam2;

public class Cafe {
    private String cafeName;
    private boolean isValid = true;
    Menu americano = new Menu(4000);
    Menu latte = new Menu(4500);

    public Cafe(String cafeName) {
        this.cafeName = cafeName;
    }

    public int sellingCoffee (String menuName) {
        if(menuName.equals("americano") == true) {
            return americano.getMenuPrice();
        }
        else if(menuName.equals("latte") == true) {
            return latte.getMenuPrice();
        }
        else {
            System.out.println("메뉴를 잘못 선택하셨습니다.");
            return 0;
        }
    }
}
