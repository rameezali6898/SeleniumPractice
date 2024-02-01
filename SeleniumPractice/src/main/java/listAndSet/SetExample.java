package listAndSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("guava");
		set.add("papaya");
		set.add("mango");
		set.add("apple");
		set.add("orange");
		set.add("apple");
		set.add("pine");
		

		for (String fruits : set) {
			System.out.println(fruits);
		}
		
		System.out.println("************************************");
		
		//Tree set changed the order into alphabetic
		//LinkedHashSet maintain the insertion order
	
		System.out.println("__________________________________________");
		
		Set<Integer> setss = new TreeSet<Integer>();
		setss.add(23);
		setss.add(15);
		setss.add(87);
		setss.add(-12);
		setss.add(129);
		setss.add(-92);
		setss.add(87);

		for (Integer numbers : setss) {
			System.out.println(numbers);
		}
		
		System.out.println("---------------------------------------------");
		//In set, get function is not there, so we can list and pass the set constructor
		List<String> myList = new ArrayList<String>(set);
		for (String listof : myList) {
			System.out.println(listof);
		}
		System.out.println("---------------------------------------------");

		System.out.println(myList.get(4));
	}
}
