package arrays;

public class SortAndInsert {

	/**
	 * @param args
	 */
	
	public static void sort(int [] array){
		for(int i = 0; i < array.length; i++){
			for(int j = i; j < array.length; j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] =  array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		printAll(array);
		int newArray[] = new int[array.length + 1]; 
		int elem = -1;
		for(int i = 0; i < array.length; i++){
			if(array[i] < elem){
				newArray[i] = array[i];
				continue;
			}
			for(int j = array.length; j > i; j--){
				newArray[j] = array[j-1];
			}
			newArray[i] = elem;
			break;
		}
		System.out.println("Sorted Array After Insertion");
		printAll(newArray);
		
	}
	
	public static void printAll(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {8, 6, 5, 2, 4, -7, -2, -3, 0, -9};
		System.out.println("Current Array");
		printAll(array);
		sort(array);
		
	}

}
