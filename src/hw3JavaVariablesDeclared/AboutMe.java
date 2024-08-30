package hw3JavaVariablesDeclared;

public class AboutMe {

	// The variable is declared.
	public String name;

	public String myName;
	public int myHomeMorgage;
	public char myGender;
	public float myHight;
	public boolean usCitizen;
	public byte myAge;
	public short mySalary;
	public long myFutureSaving;
	public double myGrade;

	public AboutMe() { // Constructor is declared here...,
		System.out.println(": ------------ This is all about Myself ------------:");
	}

	public void aboutMe() { // method implemented
		System.out.println("My Name: " + myName + "\nMy Mortgage: " + myHomeMorgage + "\nMy Gender: " + myGender
				+ "\nmy Age" + myAge + "\nmy Salary" + mySalary + "\nmy Future Salary" + myFutureSaving + "\nmy grade"
				+ myGrade + "\nMy Height: " + myHight + "\nI am US Citizen: " + usCitizen);
	}



}
