package chapter6.array;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for(Subject subject : subjectList) {
            total += subject.getScore();
            System.out.println(studentName + "학생의 " + subject.getTitle() + "과목의 점수는 " + subject.getScore() + "점 입니다.");
        }
        System.out.println("총점은 " + total + "점 입니다.");
    }

}