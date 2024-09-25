package hw17UseOfNestedIf;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C value below -->");

		Scanner scanner = new Scanner(System.in);

		double hbA1c = scanner.nextDouble();
//applying condition on hbValu
		if (hbA1c > 6.4) {
			System.out.println("........I am a diabetic patient....");
			/*
			 * if we execute step number 7, the code will not go further
			 * if(hbA1c<6.4) { System.out.
			 * println(" ....'Congratuletion'.....You are not a diabetic patient ...");
			 *
			 */
		} else {
			if (hbA1c >= 5.7) {
				System.out.println(".....I am a pre - diabetic patient.....");
			} else if (hbA1c < 5.7) {
				System.out.println(".......I am a healthy person.....");
			}
			scanner.close();

		}
	}
}