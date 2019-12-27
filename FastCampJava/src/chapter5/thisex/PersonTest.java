package chapter5.thisex;

public class PersonTest {
    public static void main(String[] args) {
        Person peronNoname = new Person();
        peronNoname.showInfo();
        peronNoname.getSelf();
        Person personLee = new Person("Lee", 20);
        personLee.showInfo();
        Person p = personLee.getSelf();
        System.out.println(personLee);
        System.out.println(p);
    }
}
