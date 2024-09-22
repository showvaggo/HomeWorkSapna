package hw15IfElseCondition;

public class Voter {

	public static void main(String[] args) {

		int age1 = 18;
		int age2 = 16;

		if (age1 == age2) {

		} else if (age1 < age2) {
			System.out.println("....I am not a voter...");

		} else if (age1 > age2) {
			System.out.println(".....I am  a Voter from age 18.....");

		} else {
			System.out.println(age1 + " is equal to " + age2);

			{
				System.out.println("....Please add a valid age....");

			}
		}
	}
}
