package hw13Polymorphism;
/*
 * Final method also can not @Override from sister class, Final keyword doesn't allow any changes
 * in the method,variable,class.no change same as like parent class method.
 * we can not @Override  static method also.
 */

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("\n.....This method come from  Niece's class.....");
	}

	@Override
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("\nNiece Age:" + total1);
	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("\nRoy family Niece's age:" + total2);
		return total2;
	}

}
