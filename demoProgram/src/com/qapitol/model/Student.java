package com.qapitol.model;

public abstract class Student {
	private int id;
	private int marks;
	private int age;

	public Student(int id, int marks, int age) {
		this.id = id;
		this.marks = marks;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}
}
