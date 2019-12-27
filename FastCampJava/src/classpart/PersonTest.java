package classpart;

public class PersonTest {
    public static void main(String[] args) {
        Person james = new Person();
        james.age = 40;
        james.name = "James";
        james.married = true;
        james.child = 3;

        james.showPerson();

    }
}
