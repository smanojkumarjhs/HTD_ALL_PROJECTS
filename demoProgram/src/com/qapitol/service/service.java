package com.qapitol.service;

import java.util.List;

import com.qapitol.model.Student;
import com.qapitol.model.Teacher;

public interface service {

	void displayTeachers(List<Teacher> teachers);

	void displayStudents(List<Student> students);

	void modifyTeacher(List<Teacher> teachers, int index, String newName, String newSubject, double newSalary);

	void modifyStudent(List<Student> students, int index, int newId, int newMarks, int newAge);

}
