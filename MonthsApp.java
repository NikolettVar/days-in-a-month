/*
*MonthsApp.java
*N Varadi
*28 10 2020
*/

import java.util.Scanner;

public class MonthsApp{
	public static void main(String args[]){
		int month;
		String message;

	Scanner keyboard;
	Months myMonth;

	keyboard = new Scanner(System.in);
	myMonth = new Months();

	System.out.println("Please enter a whole number between 1 and 12");
	month = keyboard.nextInt();

	myMonth.setMonth(month);

	myMonth.compute();

	message  = myMonth.getMessage();

	System.out.println(message);
	}
}
