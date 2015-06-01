package challenge4;

import java.util.Scanner;

public class PrintPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ODD Numbers
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the upper limit");
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
			if(i % 2 != 0)
				System.out.println(i);

	}

}
