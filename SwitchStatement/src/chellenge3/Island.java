package chellenge3;

import java.util.Scanner;

public class Island {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Island you want to visit or enter X to exit");
			String grade = in.nextLine();
			if(grade.equals("X"))
				break;
			switch(grade){
				case "Santorini":
					System.out.println("User wants to visit Santorini");
					break;
				case "Andaman":
					System.out.println("User wants to visit Andaman");
					break;
				case "Nikobar":
					System.out.println("User wants to visit Nikobar");
					break;
				case "Lakshadweep":
					System.out.println("User wants to visit Lakshwadeep");
					break;
				case "Diu":
					System.out.println("User wants to visit Diu");
					break;
				default:
					System.out.println("Unknown island");
					break;
			}			
		}

	}

}
