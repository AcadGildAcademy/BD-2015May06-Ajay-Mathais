package challenge6;

import java.util.Scanner;

public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a character or 0 to exit");
			int num = in.nextInt();
			if(num == 0)
				break;
			while(num % 2 == 0)
				num /= 2;
			if(num == 1)
				System.out.println("Power of 2");
			else
				System.out.println("NOT a power of 2");
		}
	}

}
