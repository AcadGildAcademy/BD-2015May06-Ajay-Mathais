package challenge9;

import java.util.Scanner;

public class GenderGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your gender? (M or F)");
		char gender = in.nextLine().charAt(0);
		System.out.println("What is your first name?");
		String fName = in.nextLine();
		System.out.println("What is your last name?");
		String lName = in.nextLine();
		System.out.println("What is your age, " + fName +"?");
		int age = in.nextInt();
		String name = null;
		if(age < 20)
			name = fName + " " + lName;
		else if(gender == 'M')
			name = "Mr. " + lName;
		if(gender == 'F' && age >= 20)
		{
			System.out.println("Are you married, " + fName + "? (Y or N)");
			char marriage = in.next().charAt(0);
			if(marriage == 'N')
				name = "Ms. " + lName;
			else
				name = "Mrs. " + lName;
		}
		System.out.println("Then, I shall call you " + name);
	}
}
