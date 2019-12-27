package chapter5.exam2;

public class Menu {
    private String menuName;
    private int menuPrice;

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public Menu(int menuPrice) {
        this.menuPrice = menuPrice;
    }
}
