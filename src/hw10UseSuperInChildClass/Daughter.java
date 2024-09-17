package hw10UseSuperInChildClass;

public class Daughter extends Father {

	// Global variable declared
	public String daughterBirthmonth;

	public int daughterAge;

	// default Constructor declared
	public Daughter() {
		// We can use only one super() method inside any constructor.
		// super();
		super("J.C.D.Barman", 95, 'M', false);

		// super keyword is used to call (initialize) any types of method from super
		// (Parent) class
		// super.fatherInfo();
		super.father();
		super.fatherInfo("J.C.D.Barman,", 95, 'M', false);

		// super keyword is also used to call (initialize) the variables of super
		// (Parent) class

		super.familyName = "J.C.D.Barman";

		System.out.println("I am a Constructor from Doughter Class");
	}

	// parameterized Constructor
	// super keyword is also used to call (initialize) the variables of super
	// (Parent) class
	public Daughter(String daughterBirthmonth, int daughterAge) {

		System.out.println("Name :" + daughterBirthmonth + ",Age" + daughterAge);

	}

	// void type or no return method or non parameterized method
	// method implemented
	public void daughter() {
		System.out.println(".....This is a void type method from Daughter class.....");
	}

	// parameterized methods
	public void daughterInfo(String daughterBirthmonth, int daughterAge) {
		// Inside a method of the child class, we can't call "Constructor" of super
		// class by super().
		// super();Us
		super.father();
		super.fatherInfo("J.C.D.Barman,", 95, 'M', false);

		System.out.println("Name :" + daughterBirthmonth + ",Age" + daughterAge);

	}
}