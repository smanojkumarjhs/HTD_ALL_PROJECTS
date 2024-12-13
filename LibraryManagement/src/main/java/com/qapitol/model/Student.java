package com.qapitol.model;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private String mbNo;
    private List<Address> addresses;
    private List<Book> books;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getMbNo() {
        return mbNo;
    }
    public void setMbNo(String mbNo) {
        this.mbNo = mbNo;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
