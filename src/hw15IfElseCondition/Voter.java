package hw15IfElseCondition;

public class Voter {

	public static void main(String[] args) {

		int age = 20;

		if (age == 18) {
			System.out.println("I am a Voter");

		} else if (age < 18) {
			System.out.println("....I am not a voter...");

		} else if (age > 18) {
			System.out.println(".....I am  a Voter from age 18.....");

		} else {
			System.out.println("....Please add a valid age....");
			}
		}
	}

