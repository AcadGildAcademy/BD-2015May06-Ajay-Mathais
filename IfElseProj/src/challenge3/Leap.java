package challenge3;

import java.util.Scanner;

public class Leap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the year or enter -1 to exit");
			int year = in.nextInt();
			if(year == -1)
				break;
			if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
				System.out.println("The number is NOT a leap year");
			else
				System.out.println("The number is a leap year");
			
		}
	}

}
