package challenge1;

import java.util.Scanner;

public class Vote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the age or enter 0 to exit");
			int age = in.nextInt();
			if(age==0)
				break;
			if(age<18)
				System.out.println("You are NOT elligible to vote");
			else
				System.out.println("You are eligible to vote");
			
		}
	}

}
