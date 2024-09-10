package hw10Abstraction;

public interface Hospital {
	// Default method are only allowed in interface.
	public default void morgue() {
		System.out.println("This featur come from Hospital Interface");
	}

	// Static method is a local method
	public static void pharmacy() {
		System.out.println("Pharmecy is very important in Hospital");
	}

	// method declared inside the interface body.
	public abstract void emergencyRoom();

	public String surgeryRoom();

	public void cafeteria();

}
