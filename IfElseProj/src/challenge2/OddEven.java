package challenge2;

import java.util.Scanner;

public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the age or enter -1 to exit");
			int num = in.nextInt();
			if(num == -1)
				break;
			if(num % 2 == 0)
				System.out.println("The number is EVEN");
			else
				System.out.println("The number is ODD");
			
		}
	}

}
