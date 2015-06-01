package challenge1;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1 is neither prime nor composite
		
		for(int i = 2; i <= 100 ; i++)
			if(isPrime(i))
				System.out.print(i + " ");
		
	}
	
	static boolean isPrime(int n){
		for(int i = 2; i < (n / 2); i++)
			if(n % i == 0)
				return false;			// break
		return true;
	}

}