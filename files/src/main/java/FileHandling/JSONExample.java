package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

class Student {
	public String name;
	public int age;
	public List<Subject> subjects = new ArrayList<>();

	// Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Add subject and teacher to the student's list
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
}

// Subject class to hold subject and teacher data
class Subject {
	public String subject;
	public String teacher;

	// Constructor
	public Subject(String subject, String teacher) {
		this.subject = subject;
		this.teacher = teacher;
	}
}

public class JSONExample {
	public static void main(String[] args) {
		// Create a new student
		Student student = new Student("John Doe", 20);

		// Add subjects and teachers
		student.addSubject(new Subject("Mathematics", "Mr. Smith"));
		student.addSubject(new Subject("Science", "Ms. Johnson"));

		// Create ObjectMapper to convert Java object to JSON
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			// Write student data to a JSON file
			objectMapper.writeValue(new File("studentdata.json"), student);

			System.out.println("Student data has been written to studentdata.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}