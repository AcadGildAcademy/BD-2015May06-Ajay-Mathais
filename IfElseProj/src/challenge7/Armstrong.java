package challenge7;

import java.util.Scanner;

public class Armstrong {

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
			int one = num % 10;
			int ten = (num % 100 - one) / 10;
			int cent =  (num - ten * 10 - one) / 100;
			if(num == cube(one) + cube(ten) + cube(cent))
				System.out.println(num + " is an armstrong number");
			else
				System.out.println(num + " is NOT an armstrong number");
		}
	}
	static int cube(int n){
		return n * n * n;
	}

}
