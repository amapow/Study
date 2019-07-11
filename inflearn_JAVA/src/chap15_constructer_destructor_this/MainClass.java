package chap15_constructer_destructor_this;

public class MainClass {
    public static void main(String[] args) {
        int[] iArr = {1,2,3,4,5};
        ObjectClass obj1 = new ObjectClass("앙", iArr);
        ObjectClass obj2 = new ObjectClass(1,2);
        obj2.getInfo();

    }
}
