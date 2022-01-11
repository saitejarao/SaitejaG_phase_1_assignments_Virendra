package assignment;

import java.util.*;

public class TreeHashSetAssign {
public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		TreeSet<String> hs=new TreeSet<String>();
		
		hs.add("orange");
		hs.add("apple");
		hs.add("grape");
		hs.add("mango");
		hs.add("pineapple");
		hs.add("watermelon");
		hs.add("papaya");
		hs.add("stawberry");
		hs.add("lime");
		hs.add("cherry");
		hs.add("mango");
				
		System.out.println("TreeSet is "+hs);
		System.out.println("Size of Fruit TreeSet is "+ hs.size());
		System.out.println("remove the element "+hs.remove("lime"));
		System.out.println("remove the element "+hs.remove("pineapple"));
		 hs.add("tamarind");
		 hs.add("Avocado");
		 hs.add("kiwi");
		 System.out.println("check"+hs.contains("orange"));
		 System.out.println("is  fruits TreeSet empty  " +hs.isEmpty());	
		// System.out.println("LinkedHashset is "+hs);
	}
}
