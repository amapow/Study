package chapter6.ex1;

public class StudentTest {

    public static void main(String[] args) {

        Student kim = new Student();
        kim.setStudentName("kim");

        kim.addBook("태백산맥1");
        kim.addBook("태백산맥2");
        kim.addBook("태백산맥3");
        kim.addBook("태백산맥4");
        kim.addBook("태백산맥5");

        kim.showReadBook();
    }


}
