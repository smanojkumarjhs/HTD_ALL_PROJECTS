package com.qapitol.service;

import java.util.List;

import com.qapitol.model.Student;
import com.qapitol.model.Teacher;

public class ServiceImplements implements service {
	@Override
	public void displayTeachers(List<Teacher> teachers) {
		System.out.println("\nTeachers:");
		for (Teacher teacher : teachers) {
			System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject() + ", Salary: "
					+ teacher.getSalary());

		}
	}

	@Override
	public void displayStudents(List<Student> students) {
		System.out.println("\nStudents:");
		for (Student student : students) {
			System.out.println(
					"ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());

		}
	}

	@Override
	public void modifyTeacher(List<Teacher> teachers, int index, String newName, String newSubject, double newSalary) {
		if (index >= 0 && index < teachers.size()) {
			Teacher modifiedTeacher = new Teacher(newName, newSubject, newSalary) {

			};
			teachers.set(index, modifiedTeacher);
			System.out.println("Teacher details updated successfully.");
		} else {
			System.out.println("Invalid index for teacher modification.");
		}
	}

	@Override
	public void modifyStudent(List<Student> students, int index, int newId, int newMarks, int newAge) {
		if (index >= 0 && index < students.size()) {
			Student modifiedStudent = new Student(newId, newMarks, newAge) {
			};
			students.set(index, modifiedStudent);
			System.out.println("Student details updated successfully.");
		} else {
			System.out.println("Invalid index for student modification.");
		}
	}
}
