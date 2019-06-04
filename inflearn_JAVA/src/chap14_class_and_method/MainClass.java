package chap14_class_and_method;

public class MainClass {
    public static void main(String[] args) {
        /* ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        System.out.println(" --- obj1 = " + obj1);
        System.out.println(" --- obj2 = " + obj2);
        System.out.println(" --- obj3 = " + obj3); //ObjectClass의 주소를 확인, 각기 서로 다르다. */

        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();

        obj1.getInfo();
        obj1 = null; //reference 해제





    }
}
