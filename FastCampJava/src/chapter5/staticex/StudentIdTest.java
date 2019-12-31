package chapter5.staticex;

public class StudentIdTest {
    public static void main(String[] args) {
        Student lee = new Student("lee");
        Student kim = new Student("kim");


        System.out.println(Student.getSerialNum());
        System.out.println(lee.getStudentId());
        System.out.println(kim.getStudentId());
    }
}
