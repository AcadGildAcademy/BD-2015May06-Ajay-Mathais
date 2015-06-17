package arrays;

public class ReverseOfArray {

	/**
	 * @param args
	 */
	
	public static int[] reverseArray(int[] array){
		int[] result = new int[array.length];
		for(int i = 0; i < array.length; i++)
			result[array.length - i - 1] = array[i];
		return result;
	}
	
	public static void printAll(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++)
			array[i] = i + 1;
		System.out.println("Current Array");
		printAll(array);
		System.out.println("Reversed Array");
		printAll(reverseArray(array));
	}

}
