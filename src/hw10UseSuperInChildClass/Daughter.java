package hw10UseSuperInChildClass;

public class Daughter extends Father {
	// Global variable declared
	public String birthMonth;
	public int age;

	// default Constructor declared
	public Daughter() {
		// We can use only one super() method inside any constructor.
		// super();
		super("J.C.D.Barman", 95, 'M', false);

		// super keyword is used to call (initialize) any types of method from super
		// (Parent) class	
		super.father();
		super.fatherInfo("J.C.D.Barman,", 95, 'M', false);

		// super keyword is also used to call (initialize) the variables of super
		// (Parent) class
		super.familyName = "J.C.D.Barman";
		System.out.println("I am a Constructor from Daughter Class");
	}

	// parameterized Constructor
	// super keyword is also used to call (initialize) the variables of super
	// (Parent) class
	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My Daughter's Name :" + birthMonth + ",Age" + age);
	}

	// void type or no return method or non parameterized method
	// method implemented
	public void daughter() {
		super.familyName = "J.C.D.Barman";
		System.out.println(".....This is a void type method from Daughter class.....");
	}

	// parameterized methods
	public void daughterInfo(String birthMonth, int age) {
		// Inside a method of the child class, we can't call "Constructor" of super
		// class by super().
		// super();Us
		super.father();
		super.fatherInfo("J.C.D.Barman,", 95, 'M', false);
		System.out.println("Daughter's Name :" + birthMonth + ", Daughter's Age" + age);

	}
}