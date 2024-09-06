package hw7Abstraction;

//method declared inside the interface body.

public interface University {
	public abstract void classSize();

	public String playground();

	public void teacher();

	// default constructor is not possible to create inside the interface body.
	// Interface cannot have constructors.
public University() {
	System.out.println();
}
}
