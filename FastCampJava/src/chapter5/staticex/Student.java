package chapter5.staticex;

public class Student {

    private static int serialNum = 1000;
    private int studentId;
    public String studentName;
    public String address;

    public Student(String name) {
        this.studentName = name;
        studentId = serialNum;
        serialNum++;
    }

    public Student(int id, String name) {
        studentId = id;
        studentName = name;
        address = "empty";
        studentId = serialNum;
        serialNum++;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public static int getSerialNum() {
        int i = 0;

        return getSerialNum();
    }

    public static void setSerialNum() {
        Student.serialNum = serialNum;
    }

}
