package challenge5;

import java.util.Scanner;

public class Pallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a character or 0 to exit");
			String inp = in.next();
			if(inp.equals("0"))
				break;
			int n = inp.length();
			int i = 0;
			while(i <= n/2)
			{
				if(inp.charAt(i) != inp.charAt(n-i-1))
				{
					System.out.println(inp + " is NOT a pallindrome");
					break;
				}
				i++;
			}
			System.out.println(inp + " is a pallindrome");
		}

	}

}