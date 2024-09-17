package hw14Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	// Implements keyword is used to inherit Interface in regular class.
	// Extends and implements keywords use for the inheritance in java for
	// Abstract Class.
	// An abstract class can inherit only one abstract class or one regular class by
	// extends key word.
	// An abstract class can't inherit an Interface by extends keyword.
	// An abstract class can inherit more than one interface by implements keyword

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
