package hw7Abstraction;


public abstract class MedicalSchool {

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
