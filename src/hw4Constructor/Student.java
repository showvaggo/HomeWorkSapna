package hw4Constructor;

public class Student {
	// Variable declared

	public String name;
	public int id;
	public char gender;
	public boolean isProgrammer;
	public float grade;

	// default Constructor declared
	public Student() {
		System.out.println("This is all about student");
	}

	public Student(String name, int id, char gender, float grade, boolean isProgrammer) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("Student Name : " + name + "\nStudent Id:  " + id + "\nStudent Gender: " + gender
				+ "\nStudent Grade :" + grade + "\nJava progammer? Ans :" + isProgrammer);
	}

}
