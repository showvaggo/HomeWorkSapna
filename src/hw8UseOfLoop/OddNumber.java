package hw8UseOfLoop;

public class OddNumber {

	public static void main(String[] args) {
		int startingRange = -20;
		int endRange = 50;

		for (int i = startingRange; i < endRange; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd Number: " + i);
			}

		}
	}
}
