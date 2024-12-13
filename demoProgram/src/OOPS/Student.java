package OOPS;

public class Student extends person {
	private String name ;
	private String course;
	private int marks;
	public Student(String name, int age, int id, String course,int marks) {
		super(name, age, id);
		this.course=course;
		this.marks=marks;
		
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
		
	}
	public void calculatDetails() {
		if(marks>70) {
			System.out.println("GRADE 'A' ");
		}else if(marks<=70&&marks>=50) {
			System.out.println("GRADE 'B' ");
		}else if(marks<50) {
			System.out.println("GRADE 'c' ");
		}
	}
	@Override
	void displayDetail() {
		System.out.println("ID :"+getId()+" NAME : "+getName()+" AGE : "+getAge()+" COURSE : "+getCourse()+" MARKS : "+getCourse());
		
		
	}
		
	}


