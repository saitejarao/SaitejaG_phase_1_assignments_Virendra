package assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListAssign {
	 @SuppressWarnings("unused")
	public static void main(String a[]){
	    	
	    	int a1=5;
	    	
	        LinkedList<String> ll = new LinkedList<String>();
	        ll.add("April");
	        ll.add("May");
	        ll.add("June");
	        ll.add("July");
	        ll.add("August");
	        ll.add("November");
	        ll.addLast("December");       
	        ll.addFirst("January");
	        ll.add(1, "March");
	        ll.add(1, "Febuary");
	        ll.add(8, "Septemeber");
	        ll.add(9, "October");
	        System.out.println(ll);
	              
	       Iterator itr=ll.iterator();
	        while(itr.hasNext()) {
	        System.out.println("Month is "+ itr.next());
	        }
	       System.out.println("First and Last Months:"+ll.getFirst()+" and "+ll.getLast());
	       System.out.println("remove the bithday month:"+ll.remove(6));
	       System.out.println(ll);
	       System.out.println("Does LinkedList contains winter months? "+ll.contains("winter"));
	       
	    }
}
