package chapter5.classpart;

public class Person {
    int age;
    String name;
    boolean married;
    int child;

    public void showPerson() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("결혼여부 : " + married);
        System.out.println("자녀 수 : " + child);
    }
}
