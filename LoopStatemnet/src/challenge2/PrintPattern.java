package challenge2;

public class PrintPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5, i = 0, flip = 1;
		while(i <= 5 && i >= 0){
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
			if(flip == 1)
				i++;
			else
				i--;
			if(i == 5)
				flip = 0;
		}
	}

}
