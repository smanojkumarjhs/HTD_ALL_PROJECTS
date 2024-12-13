package OOPS;

public class Teacher extends person{
	private String subjectTeacher;
	private int salary;

	public Teacher(String name, int age, int id, int salary, String subjectTeacher) {
		super(name, age, id);
		this.salary=salary;
		this.subjectTeacher=subjectTeacher;
	}

	public String getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(String subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	void displayDetail() {
		System.out.println("SALARY : "+getSalary()+" SUBJECTTEACHER : "+getSubjectTeacher());
		
	}

}
