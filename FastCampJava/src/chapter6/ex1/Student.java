package chapter6.ex1;

import java.util.ArrayList;

public class Student {
    private String studentName;
    ArrayList<Book> bookList;

    public Student() {
        bookList = new ArrayList<Book>();
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addBook(String title) {
        Book book = new Book();

        book.setTitle(title);
        bookList.add(book);
    }

    public void showReadBook() {
        System.out.print(getStudentName() + "학생이 읽은 책은 : ");
        for(Book list : bookList) {
            System.out.print(list.getTitle() + " ");
        }
        System.out.println("입니다.");
    }
}
