package recursive;

public class Recurse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc =  "welcome";
		System.out.println(recurseString(abc, abc.length()-1));

	}
	
	public static String recurseString(String a, int n){
		if(n >= 0){
			return new String(a.charAt(n) + recurseString(a, n-1));
		}
		else
			return "";
	}

}
