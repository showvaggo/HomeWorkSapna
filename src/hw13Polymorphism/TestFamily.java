package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("....This is 'Roy' famity  Sister Class.....");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(7, 9);
		sister.sister(7, 9, 17);
		sister.sister("16", 22, 24);
		sister.sister(7, 9, 17, "16", 22, 24);

		System.out.println("\n.......Total niece Age's.......");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(3, 6);
		niece.sister(2, 6, 8);

	}

}
