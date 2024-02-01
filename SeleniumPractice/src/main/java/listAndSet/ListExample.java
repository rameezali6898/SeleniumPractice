package listAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<Integer> myList = new ArrayList<Integer>();
		
		
		list.add("apple");
		list.add("orange");
		list.add("pine");
		list.add("guava");
		list.add("orange");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		for (String fruits : list) {
//			System.out.println(fruits);
//		}
//		System.out.println("------------------------------------------");
//		
//		Collections.sort(list);
//		for (String fruitss : list) {
//			System.out.println(fruitss);
//		}
//		
//		System.out.println("------------------------------------------");
//		
//		int size = list.size();
//		System.out.println(size);
//		
//		boolean isEmpty = list.isEmpty();
//		System.out.println(isEmpty);
//		
//		//list.clear();
//		
//		boolean isEmptY = list.isEmpty();
//		System.out.println(isEmptY);
//
//		boolean contains = list.contains("guava");
//		System.out.println(contains);
//		
//		String oneFruit = list.get(3);
//		System.out.println(oneFruit);
//		
//		myList.add(2);
//		myList.add(5);
//		for (Integer number : myList) {
//			System.out.println(number);
//		}
//		myList.clear();
//		boolean cleared = myList.isEmpty();
//		System.out.println(cleared);
	}

}
