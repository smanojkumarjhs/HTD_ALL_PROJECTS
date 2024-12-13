package com.qapitol.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qapitol.model.Address;
import com.qapitol.model.Book;
import com.qapitol.model.Student;
import com.qapitol.service.LibraryService;
import com.qapitol.service.LibraryServiceImpl;

public class LibraryManagementController {
	private static Scanner scanner = new Scanner(System.in);
	private static LibraryService libraryService = new LibraryServiceImpl();

	public static void main(String[] args) {
		while (true) {
			System.out.println("Library Management System");
			System.out.println("*******************************");
			System.out.println("** STUDENT OPERATIONS **");
			System.out.println("*******************************");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Get Student by id : ");
			System.out.println("4. Update Student");
			System.out.println("5. Remove Student");
			System.out.println("6. Borrow Book");
			System.out.println("*******************************");
			System.out.println("** BOOK OPERATIONS **");
			System.out.println("*******************************");
			System.out.println("7. Add Book");
			System.out.println("8. Get All Books");
			System.out.println("9. Get Book by id");
			System.out.println("10. Update Book");
			System.out.println("11. Remove Book");

			System.out.println("12. Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addStudent();
				break;
			case 2:
				viewAllStudents();
				break;
			case 3:
				getStudentById();
				break;
			case 4:
				updateStudentDetails();
				break;
			case 5:
				removeStudent();
				break;
			case 6:
				borrowBook();
				break;
			case 7:
				addBook();
				break;
			case 8:
				getAllBooks();
				break;
			case 9:
				getBookById();
				break;
			case 10:
				updateBookDetails();
				break;
			case 11:
				removeBook();
				break;
			case 12:
				System.exit(0);
				break;
			}
		}
	}

	private static void removeBook() {
		System.out.println("Enter the book ID to be removed: ");
		int bookId = scanner.nextInt();
		libraryService.removeBook(bookId);
	}

	private static void updateBookDetails() {
		System.out.println("Enter the book ID to update: ");
		int bookId = scanner.nextInt();
		scanner.nextLine(); 

		System.out.println("Enter the new Book Subject: ");
		String subject = scanner.nextLine();

		System.out.println("Enter the new Book Count: ");
		int bookCount = scanner.nextInt();

		Book book = new Book();
		book.setBookID(bookId);
		book.setSubject(subject);
		book.setBookCount(bookCount);

		libraryService.updateBookDetails(bookId, book);
		System.out.println("Book updated successfully.");
	}

	private static void getBookById() {
		System.out.println("Enter the book ID to get: ");
		int bookId = scanner.nextInt();
		Book book = libraryService.getBookById(bookId);
		if (book != null) {
			System.out.println("Book ID: " + book.getBookID()
			+ ", Subject: "
					+ book.getSubject() 
					+ ", Count: "
					+ book.getBookCount());
		} else {
			System.out.println("Book not found.");
		}
	}

	private static void getAllBooks() {
		List<Book> books = libraryService.getAllBooks();
		books.forEach(book -> {
			System.out.println(
					"ID: " + book.getBookID()
					+ ", Subject: " + book.getSubject()
					+ ", Count: " + book.getBookCount());
		});
	}

	private static void addBook() {
		System.out.println("Enter the number of books to add: ");
		int numberOfBooks = scanner.nextInt();
		scanner.nextLine(); 

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("Enter Book ID: ");
			int bookID = scanner.nextInt();
			scanner.nextLine(); 
			System.out.println("Enter Book Subject: ");
			String subject = scanner.nextLine();
			System.out.println("Enter Book Count: ");
			int bookCount = scanner.nextInt();
			scanner.nextLine(); 
			Book book = new Book();
			book.setBookID(bookID);
			book.setSubject(subject);
			book.setBookCount(bookCount);

			libraryService.addBook(book);
			System.out.println("Book added successfully.");
		}
	}

	private static void removeStudent() {
		System.out.println("Enter the student ID to be removed: ");
		int studentId = scanner.nextInt();
		libraryService.removeStudent(studentId);
	}

	private static void updateStudentDetails() {
		System.out.println("Enter the student ID to update: ");
		int studentId = scanner.nextInt();
		scanner.nextLine(); 

		System.out.println("Enter the new student name: ");
		String name = scanner.nextLine();

		System.out.println("Enter the new student age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the new mobile number: ");
		String mobileNumber = scanner.nextLine();

		Student student = new Student();
		student.setId(studentId);
		student.setName(name);
		student.setAge(age);
		student.setMbNo(mobileNumber);

		List<Address> addresses = new ArrayList<>();
		System.out.println("Enter address details.");
		System.out.print("Street Name: ");
		String streetName = scanner.nextLine();
		System.out.print("Complete Address: ");
		String completeAddress = scanner.nextLine();
		System.out.print("Pincode: ");
		String pincode = scanner.nextLine();

		Address address = new Address();
		address.setStreetName(streetName);
		address.setCompleteAddress(completeAddress);
		address.setPincode(pincode);
		addresses.add(address);

		student.setAddresses(addresses);
		libraryService.updateStudentDetails(studentId, student);

		System.out.println("Student updated successfully.");
	}

	private static void getStudentById() {
		System.out.println("Enter Student ID: ");
		int studentId = scanner.nextInt();
		Student student = libraryService.getStudentById(studentId);
		if (student != null) {
			System.out.println("ID: " + student.getId()); 
				System.out.println(", Name: " + student.getName() );//	+ ", Name: " + student.getName() 
				System.out.println( ", Age: " + student.getAge());	//+ ", Age: " + student.getAge());
		} else {
			System.out.println("Student not found.");
		}
	}

	private static void addStudent() {
		System.out.println("Enter the number of students to add: ");
		int numberOfStudents = scanner.nextInt();
		scanner.nextLine(); 

		for (int i = 0; i < numberOfStudents; i++) {
			Student student = new Student();
			System.out.println("Enter Student ID: ");
			student.setId(scanner.nextInt());
			scanner.nextLine(); 

			System.out.println("Enter Student Name: ");
			student.setName(scanner.nextLine());

			System.out.println("Enter Student Age: ");
			student.setAge(scanner.nextInt());
			scanner.nextLine(); 

			System.out.println("Enter Student Mobile Number: ");
			student.setMbNo(scanner.nextLine());

			List<Address> addresses = new ArrayList<>();
			System.out.print("Enter Address Street Name: ");
			String streetName = scanner.nextLine();
			System.out.print("Enter Complete Address: ");
			String completeAddress = scanner.nextLine();
			System.out.print("Enter Pincode: ");
			String pincode = scanner.nextLine();

			Address address = new Address();
			address.setStreetName(streetName);
			address.setCompleteAddress(completeAddress);
			address.setPincode(pincode);
			addresses.add(address);
			student.setAddresses(addresses);

			libraryService.addStudent(student);
			System.out.println("Student added successfully.");
		}
	}

	private static void viewAllStudents() {
		List<Student> students = libraryService.getAllStudents();
		students.forEach(student -> {
			System.out.println("ID: " + student.getId());
				System.out.println(" Name: " + student.getName());	 //" Name: " + student.getName()
					System.out.println( ", Age: " + student.getAge());
					System.out.println( ", mobileNumber: " + student.getMbNo());
				//	System.out.println( ", Address: " + student.getAddresses());
					//System.out.println( ", Books: " + student.getBooks());
					
		});
	}

	private static void borrowBook() {
		System.out.println("Enter Student ID: ");
		int studentId = scanner.nextInt();

		System.out.println("Enter Book ID: ");
		int bookID = scanner.nextInt();

		libraryService.borrowBook(studentId, bookID);
	}
}
