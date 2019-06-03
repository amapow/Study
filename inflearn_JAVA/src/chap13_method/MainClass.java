package chap13_method;

public class MainClass {
    public static void main(String[] args) {
        ChildClass child1 = new ChildClass();
        child1.name = "honggil.dong";
        child1.gender = "woman";
        child1.age = 20;

        child1.getInfo();

        ChildClass child2 = new ChildClass();
        child2.setInfo("kim.Yuna", "M", 10);
        child2.getInfo();
    }
}
