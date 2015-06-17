package collections;

import java.util.*;
import java.util.Map.Entry;

public class Hashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap <Integer, String> ();
		map.put(1, "tutorials");
		map.put(2, "point");
		map.put(3, "is best");
		
		Set<Entry<Integer, String>> es =  map.entrySet();
		
		Iterator <Entry <Integer, String>> itr = es.iterator();
		
		while(itr.hasNext()){
			Entry<Integer, String> curr = (Entry<Integer, String>) itr.next();
			System.out.println(curr.getKey() + " = " + curr.getValue());
			
		}
		

	}

}