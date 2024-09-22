package hw16IfElseCondition;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.Utilities;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("...Today's Weather...");

	}

	Scanner scanner = new Scanner(System.in);
	int tem1 = scanner.nextInt();
	int tem2 = scanner.nextInt();
	int tem3 = scanner.nextInt();
	int tem4 = scanner.nextInt();
	int tem5=scanner.nextInt();
	{
		if (tem1 <32, tem2<55, tem3<73, tem4<101, >tem5 ) {
			System.out.println("");
			
		}
		
	}else if(todaysTemperature<tem1)
	
		{System.out.println("Freezing");

	}else if(todaysTemperature<tem2)
	{
		System.out.println("Pleasent");
	}else if(todaysTemperature<tem3)
	{
		System.out.println("Getting Warmer");

	}else if(todaysTemperature<tem4)
	{
		System.out.println("Hot");

	}else if(todaysTemperature>tem5)
	{
		System.out.println("Very Hot");
	}else
	{
		System.out.println(".....Please put a valid temperature......");
		scanner.close();

	}
}}
