package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		do {
			System.out.println("***** Menu *****");
			System.out.println("1. Add teacher");
			System.out.println("2. Add student");
			System.out.println("3. Exit");
			System.out.println(" Enter your chouice : ");

			switch (choice) {
			case 1: {
				System.out.println("Enter teacher id");
				int id = s.nextInt();
				System.out.println("Enter Teacher Name");
				String name = s.next();
				System.out.println("Enter Teacher age");
				int age = s.nextInt();
				System.out.println("Enter subject");
				String subjectTeacher = s.next();
				System.out.println("Enter salary");
				int salary = s.nextInt();
				Teacher teacher = new Teacher(subjectTeacher, salary, salary, salary, subjectTeacher);
				teacher.setAge(age);
				teacher.setId(id);
				teacher.setName(name);
				teacher.setSalary(salary);
				teacher.setSubjectTeacher(subjectTeacher);
				ArrayList<Teacher> alt = new ArrayList<Teacher>();
				alt.add(teacher);
				for (Teacher data : alt) {
					System.out.println(data.toString());
				}
			}
				break;
			case 2: {
				System.out.println("Enter student id");
				int id = s.nextInt();
				System.out.println("Enter student name");
				String name = s.next();
				System.out.println("Enter student age");
				int age = s.nextInt();
				System.out.println("Enter course");
				String course = s.next();
				System.out.println("Enter marks");
				int marks = s.nextInt();
				Student student = new Student(name, age, id, course, marks);
				student.setId(id);
				student.setName(name);
				student.setAge(age);
				student.setCourse(course);
				student.setMarks(marks);
				student.calculatDetails();
				ArrayList<Student> studentAL = new ArrayList<>();
				studentAL.add(student);
				for (Student data : studentAL) {
					System.out.println(data.toString());
				}
			}
				break;
			default:
				System.out.println("Enter the correct choice : ");

			}
		} while (choice != 3);

		s.close();
	}

}
