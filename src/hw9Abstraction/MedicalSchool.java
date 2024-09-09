package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	// An abstract class can inherit only one abstract class ,one regular class by
	// extends key word.
	// An abstract class can't inherit an Interface by extends key word.

	// Constructor Declare inside Abstract class.
	public MedicalSchool() {
		System.out.println("....This constructor is from Abstract class...Medical School....");
	}

	// non abstract method or implemented method
	public void anatomyLab() {
		System.out.println(".....The Anatomy lab is very importent in Medical School.....");
	}

	// abstract method
	public abstract void biochemistryLab();
}
