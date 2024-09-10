package hw10Abstraction;

//method declared inside the interface body.

public interface University extends Collage, Hospital {

	// Only one keyword"extends" use in Interface .
	/*
	 * An Interface can inherit more then one interface by 'extends' keyword and
	 * separated by comma. Interface can not inherit regular class or abstract
	 * class.
	 */

	// Default method are only allowed in interface.
	public default void gymnasium() {
		System.out.println("This gymnasium come from University Interface");
	}

	// Static method is a local method can be used inside regular class.
	public static void library() {
		System.out.println("Library is come from University");
	}

	public abstract void classSize();

	public String playground();

	public void teacher();

	// default constructor is not possible to create inside the interface body.
	// Interface cannot have constructors.
//public University(){	

}
