package except;

public class ArrayIndexOutOfBounds {
	
	
	public static void main(String[] args){
		int[] a = new int[5];
		
		try{
			a[5] = 9;
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Array Index Out of Bound");;
		}
	}

}
