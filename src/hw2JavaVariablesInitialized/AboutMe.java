package hw2JavaVariablesInitialized;

public class AboutMe {

	// The variable is declared.
	public String name;

	// The variable is initialized.
	public String city_name = "New York";
	public String myName = "Sapna Rani";
	public int myHomeMorgage = 750076;
	public char myGender = 'F';
	public float myHight = 5.234f;
	public boolean usCitizen = true;

	public AboutMe() { // Constructor is declared here...,
		System.out.println(": ------------ This is all about Myself ------------:");
	}

	public void aboutMe() {  //method implemented
		System.out.println("My Name: " + myName + "\nMy Mortgage: " + myHomeMorgage + "\nMy Gender: " + myGender
				+ "\nMy Height: " + myHight + "\nI am US Citizen: " + usCitizen);
	}

	public static void main(String[] args) {

		AboutMe sapna = new AboutMe(); // Constructor initialized
		sapna.aboutMe(); // method initialized

	}

}
