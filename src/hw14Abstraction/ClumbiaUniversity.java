package hw14Abstraction;

//a regular class
public class ClumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

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

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public String laboratory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public String surgeryRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawSchoolInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalSchoolInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public String playground() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub

	}
}
