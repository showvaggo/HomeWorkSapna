package hw7Abstraction;

//It is not possible to create regular class body inside abstract methods,
//If you want to create a abstract method inside ClumbiaUniversity class body,
//You must define the ClumbiaUniversity class an abstract to define abstract methods.
public class ClumbiaUniversity {

	// default Constructor declared
	public ClumbiaUniversity() {
		System.out.println(".....This is all about clumbiaUniversity.....");
	}

	// non abstract method or implemented method
	public void chemistry() {
		System.out.println("Chemistry subject from Clumbia University");

	}

	// I try to create abstract methods inside the regular class body ,It is not
	// working.
	// Abstract methods do not specify a body
	public abstract void biology():



}
