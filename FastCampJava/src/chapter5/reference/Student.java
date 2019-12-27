package chapter5.reference;

public class Student {

    int studentID;
    String studentName;
    Subject korea;
    Subject math;

    public Student(int id, String name) {
        this.studentID = id;
        this.studentName = name;
    }

    public void showStudentInfo() {
        System.out.println("ID = " + this.studentID);
        System.out.println("Name = " + this.studentName);
        System.out.println("Math score = " + this.math.score);
        System.out.println("korea score = " + this.korea.score);
        System.out.println();
    }
}
