package assignment;

import java.util.HashSet;

public class HashSetAssign {
public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		HashSet<String> hs=new HashSet<String>();
		
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
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Fruit Hashset is "+ hs.size());
		System.out.println("remove the element "+hs.remove("lime"));
		System.out.println("remove the element "+hs.remove("pineapple"));
		 hs.add("tamarind");
		 hs.add("Avocado");
		 hs.add("kiwi");
		 System.out.println("check"+hs.contains("orange"));
		 System.out.println("is  fruits hashset empty  " +hs.isEmpty());
		
		
		
	
		
	}
}
