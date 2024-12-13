package com.qapitol.service;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qapitol.model.Book;
import com.qapitol.model.Student;

public class LibraryServiceImpl implements LibraryService {
    private static final String STUDENT_FILE_PATH = "C:\\Users\\Qapitol QA\\eclipse-workspace\\LibraryManagement\\src\\test\\resources\\Repositories\\students.json";
    private static final String BOOK_FILE_PATH = "C:\\Users\\Qapitol QA\\eclipse-workspace\\LibraryManagement\\src\\test\\resources\\Repositories\\books.json";
    private Gson gson = new Gson();

    @Override
    public void addStudent(Student student) {
        List<Student> students = readStudentsFromFile();
        students.add(student);
        writeStudentsToFile(students);
    }

    @Override
    public void removeStudent(int studentId) {
        List<Student> students = readStudentsFromFile();
        students.removeIf(student -> student.getId() == studentId);
        writeStudentsToFile(students);
    }

    @Override
    public void updateStudentDetails(int studentId, Student updatedStudent) {
        List<Student> students = readStudentsFromFile();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentId) {
                students.set(i, updatedStudent);
                break;
            }
        }
        writeStudentsToFile(students);
    }

    @Override
    public Student getStudentById(int studentId) {
        List<Student> students = readStudentsFromFile();
        return students.stream().filter(student -> student.getId() == studentId).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return readStudentsFromFile();
    }

    @Override
    public void addBook(Book book) {
        List<Book> books = readBooksFromFile();
        books.add(book);
        writeBooksToFile(books);
    }

    @Override
    public void removeBook(int bookId) {
        List<Book> books = readBooksFromFile();
        books.removeIf(book -> book.getBookID() == bookId);
        writeBooksToFile(books);
    }

    @Override
    public void updateBookDetails(int bookId, Book updatedBook) {
        List<Book> books = readBooksFromFile();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookId) {
                books.set(i, updatedBook);
                break;
            }
        }
        writeBooksToFile(books);
    }

    @Override
    public Book getBookById(int bookId) {
        List<Book> books = readBooksFromFile();
        return books.stream().filter(book -> book.getBookID() == bookId).findFirst().orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return readBooksFromFile();
    }

    @Override
    public void borrowBook(int studentId, int bookID) {
        List<Student> students = readStudentsFromFile();
        List<Book> books = readBooksFromFile();

        Student student = students.stream().filter(s -> s.getId() == studentId).findFirst().orElse(null);
        Book book = books.stream().filter(b -> b.getBookID() == bookID).findFirst().orElse(null);

        if (student != null && book != null && book.getBookCount() > 0) {
            book.setBookCount(book.getBookCount() - 1);
            writeBooksToFile(books);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available or Student not found.");
        }
    }

    private List<Student> readStudentsFromFile() {
        try (Reader reader = new FileReader(STUDENT_FILE_PATH)) {
            return gson.fromJson(reader, new TypeToken<List<Student>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void writeStudentsToFile(List<Student> students) {
        try (Writer writer = new FileWriter(STUDENT_FILE_PATH)) {
            gson.toJson(students, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Book> readBooksFromFile() {
        try (Reader reader = new FileReader(BOOK_FILE_PATH)) {
            return gson.fromJson(reader, new TypeToken<List<Book>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void writeBooksToFile(List<Book> books) {
        try (Writer writer = new FileWriter(BOOK_FILE_PATH)) {
            gson.toJson(books, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
