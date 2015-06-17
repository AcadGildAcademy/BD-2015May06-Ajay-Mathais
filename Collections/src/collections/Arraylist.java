package collections;

import java.util.*;

public class Arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(177);
		list.add(99);
		list.add(23);
		list.add(556);
		list.add(32);
		
		Iterator <Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("The current element is " + itr.next());
		}
	}

}
