package chapter5.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student james = new Student();
        james.studentName = "james";
        james.studentID = 1376053062;
        james.address = "Seoul";

        Student tom = new Student(10, "Seoul");
        tom.studentName = "tom";
        Student dan = new Student("dan");
        dan.address = "Anyang";
        tom.showStudentInfo();
        dan.showStudentInfo();
        james.showStudentInfo();
    }
}
