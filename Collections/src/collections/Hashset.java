package collections;

import java.util.*;


public class Hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(23);
		set.add(177);
		set.add(99);
		set.add(23);
		set.add(556);
		set.add(23);
		
		for(int curr: set){
			System.out.println(curr);
		}
		

	}

}
