package assignment;

import java.util.LinkedHashMap;

public class LinkedHashMapAssign {
public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		LinkedHashMap<Integer, String> hs=new LinkedHashMap<Integer, String>();
		
		hs.put(1,"orange");
		hs.put(2,"apple");
		hs.put(3,"grape");
		hs.put(7,"mango");
		hs.put(5,"banana");
		hs.put(6,"watermelon");
		hs.put(4,"papaya");
		hs.put(8,"stawberry");
		hs.put(9,"lime");
		hs.put(10,"cherry");
		
				
		System.out.println("LinkedHashMap is "+hs);
		System.out.println("Size of Fruit LinkedHashMap is "+ hs.size());
		System.out.println("remove the element "+hs.remove(4));
		System.out.println("remove the element "+hs.remove(7));
		 
		 System.out.println("check banana "+hs.containsValue("banana"));
		 System.out.println("check apple "+hs.containsValue("apple"));
		 System.out.println("check "+hs.containsKey(4));
		 System.out.println("Hashcode "+hs.hashCode());
		hs.clear();
		// System.out.println("LinkedHashset is "+hs);
	}
}
