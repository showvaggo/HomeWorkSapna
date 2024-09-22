package hw16IfElseCondition;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("...Today's Weather...");

	}

	Scanner scanner = new Scanner(System.in);

	int todaysTemperature1 = scanner.nextInt();
	int todaysTemperature2 = scanner.nextInt();
	int todaysTemperature3 = scanner.nextInt();
	int todaysTemperature4 = scanner.nextInt();
	int todaysTemperature5 = scanner.nextInt();
	{
		if (todaysTemperature1 < 32) {
			System.out.println("'.....Freezing.......");

		} else if (todaysTemperature2 < 55) {
			System.out.println("....Pleasent......");

		} else if (todaysTemperature3 < 73) {
			System.out.println("......Getting Warmer......");

		} else if (todaysTemperature4 < 101) {
			System.out.println(".....Hot.....");

		} else if (todaysTemperature5 > 101) {
			System.out.println("......Very Hot.....");

		} else {
			System.out.println("....Please put a valid temperature...");
			scanner.close();

		}

		{

		}
		{

		}
		{

		}

	}
}
