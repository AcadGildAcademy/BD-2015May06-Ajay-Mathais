package challenge2;

import java.util.Scanner;

public class Grade {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int success;
		while(true)
		{
			System.out.println("Enter the grade or enter X to exit");
			String grade = in.nextLine();
			if(grade.equals("X"))
				break;
			switch(grade){
				case "A":
					success = 1;
					break;
				case "B":
					success = 1;
					break;
				case "C":
					success = 0;
					break;
				case "D":
					success = 0;
					break;
				default:
					success = 0;
					break;
			}
			switch(success)
			{
				case 1:
					System.out.println("Good Grade");
					break;
				case 0:
					System.out.println("Scope for improvement");
					break;
			}
		}
		
	}

}
