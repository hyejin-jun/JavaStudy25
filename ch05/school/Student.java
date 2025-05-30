package ch05.school;

public class Student extends School {

	private String studentID;
	private int garde;
	private double gpa;

	public String getStudenID() {
		return studentID;
	}

	public int getGarde() {
		return garde;
	}

	public double getGpa() {
		return gpa;
	}

	public void setStudenID (String studenID) {
		this.studentID = studenID;
	}

	public void setGarde(int garde) {
		this.garde = garde;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(String name, int height, int weight, int age, String studentID, int grade, double gpa) {
		super(name, height, weight, age); // 게터와 세터 활용

		this.studentID = studentID;
		this.garde = garde;
		this.gpa = gpa;
	}

	public void show() {
		System.out.println("---------------------");
		System.out.println("학생 이름: " + getName());
		System.out.println("학생 나이: " + getAge());
		System.out.println("학생 키: " + getHeight());
		System.out.println("학생 몸무게: " + getWeight());
		System.out.println("------------------------");
		System.out.println("학생 학번: " + getStudenID());
		System.out.println("학생 학년: " + getGarde());
		System.out.println("학생 학점: " + getGpa());
		System.out.println("------------------------");

	}

}
