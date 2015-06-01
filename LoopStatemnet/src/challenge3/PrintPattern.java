package challenge3;

public class PrintPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 16; i++ )
			if((i - 1) % 3 == 0)
				System.out.println(i);

	}

}
