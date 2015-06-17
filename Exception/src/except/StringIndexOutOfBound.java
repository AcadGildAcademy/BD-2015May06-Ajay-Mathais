package except;

public class StringIndexOutOfBound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hi = "Hello World";
		int i = 100;
		try{
			System.out.println(hi.charAt(i));
		}
		catch(StringIndexOutOfBoundsException ex){
			System.out.println("String Index Out of Abount");
		}

	}

}
