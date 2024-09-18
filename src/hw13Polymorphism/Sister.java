package hw13Polymorphism;

public class Sister {

	/*
	 * When different methods exist with the same method name but different
	 * parameters,it is called method overloading. Overloading can be
	 * void,return,parameterized,non-parameterized,static,ono-static or final type
	 * methods. be careful when you count the number of parameter,If parameter
	 * number is same,it is not allowed. But you can change the different number of
	 * parameter,position that time it is allowed.
	 */

//void type non parameterized method (1) is implemented
	public void sister() {
		System.out.println("The void type method from Sister Class");

	}

	// void type parameterized method (2) is implemented
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("\n......This is 'Roy' Family sister age......");
	}

	// return type parameterized method(3)implemented
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("\n.....Total age from 'Roy' Family Sister Class......" + total2);
		return total2;
	}
	// same number of parameter,same position of parameter not allowed,different
	// position is ok.

	public int sister(String age4, int age5, int age6) {

		int total3 = Integer.parseInt(age4) + age5 + age6;

		System.out.println("\n.....Total age from' Deb Barman' family Sister Class....." + total3);
		return total3;

	}

	public static void sister(int age1, int age2, int age3, String age4, int age5) {
		int total4 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("\n......This method come from 'Sarker' Family sister  list....");
	}

	public final void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total5 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("\n....This method come from 'Basu' Family......");

	}

}
