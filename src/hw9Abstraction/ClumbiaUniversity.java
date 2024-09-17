package hw9Abstraction;

public class ClumbiaUniversity extends RockefellerUniversity{
	// A regular class can inherit only one regular or abstract class by extends
	// keyword.
	// A regular class can't inherit an Interface by extends keyword.
	// non abstract method or implemented method.
	public void chemistry() {
		System.out.println("Chemistry subject is from Clumbia University");

	}
	// I try to create abstract methods inside inside the regular class body.It is
	// not working.
	// public abstract void biology() {

	// default Constructor declared.
	public ClumbiaUniversity() {

	}
}
