package challenge1;

import java.util.Scanner;

public class DaysInMonth {
	/* Java 7 has strings in switch cases  */
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the month or enter X to exit");
			String month = in.nextLine();
			if(month.equals("X"))
				break;
			switch(month){
				case "January":
					System.out.println("31 days!");
					break;
				case "February":
					System.out.println("Enter the year");
					int year = in.nextInt();
					if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
						System.out.println("28 days!");
					else
						System.out.println("29 days!");
					break;
				case "March":
					System.out.println("31 days!");
					break;
				case "April":
					System.out.println("30 days!");
					break;
				case "May":
					System.out.println("31 days!");
					break;
				case "June":
					System.out.println("30 days!");
					break;
				case "July":
					System.out.println("31 days!");
					break;
				case "August":
					System.out.println("31 days!");
					break;
				case "September":
					System.out.println("30 days!");
					break;
				case "October":
					System.out.println("31 days!");
					break;
				case "November":
					System.out.println("30 days!");
					break;
				case "December":
					System.out.println("31 days!");
					break;
				default:
					System.out.println("Please check the month you've entered");
					break;
			}
		}
	}

}
