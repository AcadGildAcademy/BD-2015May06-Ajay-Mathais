package except;

public class NullPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = null;
		try{
			System.out.println(a.charAt(3));
		}
		catch(NullPointerException ex){
			System.out.println("Null Pointer Exception");
		}

	}

}
