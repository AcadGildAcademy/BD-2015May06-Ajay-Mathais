package challenge4;

import java.util.Scanner;

public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a character or 0 to exit");
			char inp = in.next().charAt(0);
			if(inp == '0')
				break;
			if(inp == 'A' || inp == 'E' || inp == 'I' || inp == 'O' || inp == 'U' || inp == 'a' || inp == 'e' || inp == 'i' || inp == 'o' || inp == 'u')
				System.out.println(inp + " is a vowel");
			else
				System.out.println(inp + " is NOT a vowel");
		}
	}

}
