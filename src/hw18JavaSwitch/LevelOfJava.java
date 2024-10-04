package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {

	public static void main(String[] args) {
		System.out.println("<......Please write about your Java Level....>");

		Scanner scanner = new Scanner(System.in);
		
		String myLevel = scanner.nextLine();

		switch (myLevel) {

		case "Beginner":
			System.out.println("......I am the beginning level.....");
			break;

		case "Intermediate":
			System.out.println(".....I am the intermeadiate level....");
			break;

		case "Expert":
			System.out.println(".....I am at expert level....");
			break;

		case "Excellent":
			System.out.println("......I am a Java Certification from Oracle....");
			break;

		default:
			System.out.println("....I am a drop out....");
			break;

		}
		scanner.close();
	}

}
