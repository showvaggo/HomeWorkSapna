package hw10Abstraction;

public interface Collage {
	// Default method are only allowed in interface.
	public default void dorm() {
		System.out.println("The dorm come from College Interface");
	}
	// Static method is a local method

	public static void studyRoom() {
		System.out.println("Study Room is very Importent in College");
	}

	// method declared inside the interface body.
	public abstract void commonRoom();

	public String laboratory();

	public void languageClub();

}
