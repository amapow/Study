package chapter5.reference;

public class Subject {

    String subjectName;
    int subjectID;
    int score;

    public Subject setSubject(String name, int score) {
        this.subjectName = name;
        this.score = score;
        return Subject.this;
    }
}
