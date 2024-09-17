package hw10UseSuperInChildClass;

public class Father {
	// Global variable declared
	public String fatherName;
	public int fatherAge;
	public char fatherSex;
	public boolean fatherUsCitizen;
	public String familyName;

	// default Constructor declared
	public Father() {

		System.out.println("I am a Constructor from Father Class");
	}

	// parameterized Constructor

	public Father(String fatherName, int fatherAge, char fatherSex, boolean fatherUsCitizen) {
		super();

		this.fatherName = fatherName;
		this.fatherAge = fatherAge;
		this.fatherSex = fatherSex;
		this.fatherUsCitizen = fatherUsCitizen;

		System.out.println(
				"Name:" + fatherName + ",Age:" + fatherAge + ",Sex:" + fatherSex + ", Us Citizen:" + fatherUsCitizen);

	}

	// void type or no return method or non parameterized method
	// method implemented
	public void father() {

		System.out.println("This is a void type method from Father class");
	}

	// parameterized methods
	public void fatherInfo(String fatherName, int fatherAge, char fatherSex, boolean fatherUsCitizen) {

		System.out.println(
				"Name:" + fatherName + ",Age:" + fatherAge + ",Sex:" + fatherSex + ", Us Citizen:" + fatherUsCitizen);

	}

}
