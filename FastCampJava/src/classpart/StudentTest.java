package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "tjdnf";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김슬기";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
