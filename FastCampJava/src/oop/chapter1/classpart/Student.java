package oop.chapter1.classpart;

public class Student {

    public int studentID;
    public String studentName;
    public String address;

    public Student() {}
    public Student(int id, String address) {
        this.studentID = id;
        this.address = address;
    }
    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }
}

