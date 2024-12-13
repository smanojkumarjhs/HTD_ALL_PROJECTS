package com.qapitol.service;
import java.util.List;

import com.qapitol.model.Book;
import com.qapitol.model.Student;

public interface LibraryService {
	
    void addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int studentId);
    void updateStudentDetails(int studentId, Student student);
    void removeStudent(int studentId);
    void borrowBook(int studentId, int bookID);
    

    void addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int bookID);
    void updateBookDetails(int bookID, Book book);
    void removeBook(int bookID);
}
