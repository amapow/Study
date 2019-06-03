package chap13_method;

public class ChildClass {

    public String name;
    public String gender;
    public int age;

    //호출부
    public ChildClass() {
        System.out.println("-- ChildClass Constructer --");
    }

    public void setInfo(String n, String g, int a) {
        System.out.println("-- setInfo() Start --");
        name = n;
        gender = g;
        age = a;
    }
    //선언부
    public void getInfo() {
        //정의부부
       System.out.println("-- getInfo() Start --");
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
    }

    private void mySecret() {
        System.out.println("-- my Seceret --");
    }
}
