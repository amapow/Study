package classpart;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
