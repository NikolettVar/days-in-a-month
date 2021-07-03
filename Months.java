/*
*Months.java
*N Varadi
*28 10 2020
*/

public class Months{
	private int month;
	private String message;

	public Months(){
		month = 0;
		message = "";
	}

	public void setMonth(int month){
		this.month = month;
	}

	public void compute(){
		switch(month){
			case 1:
			message = "The first month is January, and it has 31 days.";
			break;

			case 2:
			message  = "The second month is February, and it has 28 days.";
			break;

			case 3:
			message = "The third month is March, and it has 31 days.";
			break;

			case 4:
			message = "The fourth month is April, and it has 30 days.";
			break;

			case 5:
			message = "The fifth month is May, and it has 31 days.";
			break;

			case 6:
			message = "The sixth month is June, and it has 30 days.";
			break;

			case 7:
			message = "The seventh month is July, and it has 31 days.";
			break;

			case 8:
			message = "The eighth month is August, and it has 31 days.";
			break;

			case 9:
			message = "The ninth month is September, and it has 30 days.";
			break;

			case 10:
			message = "The tenth month is October, and it has 31 days.";
			break;

			case 11:
			message = "The eleventh month is November, and it has 30 days.";
			break;

			case 12:
			message = "The twelfth month is December, and it has 31 days.";
			break;

			default:
			message = "That is not a valid number input, please enter a whole number between 1 and 12";
			break;
		}
	}

	public String getMessage(){
		return message;
	}
}