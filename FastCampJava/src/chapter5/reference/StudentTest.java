package chapter5.reference;

public class StudentTest {
    public static void main(String[] args) {
        Subject math = new Subject();
        Subject korea = new Subject();
        Student jung = new Student(1, "janghyeon");
        Student tom = new Student(2, "tom");
        jung.math = math.setSubject("math", 100);
        jung.korea = math.setSubject("korea", 94);
        tom.math = korea.setSubject("math", 38);
        tom.korea = korea.setSubject("korea", 100);

        jung.showStudentInfo();
        tom.showStudentInfo();
    }
}
