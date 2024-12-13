package com.qapitol.model;
import java.util.List;

public class Book {
    private int bookID;
    private String subject;
    private int bookCount;
    private List<Student> students;

    
    public int getBookID() {
        return bookID;
    }
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
