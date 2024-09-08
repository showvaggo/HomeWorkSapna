package hw8Encapsulation;

public class Employee {
	// These is call private variable ,User only use this class.
	private String emNameString;
	private int emAge;
	private char emSex;
	private boolean emCitizen;

	public String getEmNameString() {
		return emNameString;
	}

	public void setEmNameString(String emNameString) {
		this.emNameString = emNameString;
		// By using getter and setter method,private type data can be accessed to public
		// type.
	}

	public int getEmAge() {
		return emAge;
	}

	public void setEmAge(int emAge) {
		this.emAge = emAge;
	}

	public char getEmSex() {
		return emSex;
	}

	public void setEmSex(char emSex) {
		this.emSex = emSex;
	}

	public boolean isEmCitizen() {
		return emCitizen;
	}

	public void setEmCitizen(boolean emCitizen) {
		this.emCitizen = emCitizen;
	}

}
