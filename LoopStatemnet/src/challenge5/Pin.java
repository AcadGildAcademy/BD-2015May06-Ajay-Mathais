package challenge5;

import java.util.Scanner;

public class Pin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INITITALIZED_PIN = 5682;
		Scanner in = new Scanner(System.in);
		System.out.println("WELCOME TO STATE BANK OF INDIA");
		int pin = 0;
		while(true){
			System.out.print("Enter your Pin : ");
			pin = in.nextInt();
			if(pin == INITITALIZED_PIN)
				break;
			else
				System.out.println("Incorrect Pin. Try Again.");
		}
		System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}

}
