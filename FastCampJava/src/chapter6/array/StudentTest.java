package chapter6.array;

public class StudentTest {

    public static void main(String[] args) {
        Student kim = new Student(1001, "kim");
        Student lee = new Student(1002, "lee");
        kim.addSubject("국어", 100);
        kim.addSubject("수", 100);
        lee.addSubject("국어", 50);
        lee.addSubject("수학", 50);
        lee.addSubject("영어", 50);
        System.out.println(kim.subjectList.size());
        kim.showStudentInfo();
        System.out.println();
        lee.showStudentInfo();
    }
}
