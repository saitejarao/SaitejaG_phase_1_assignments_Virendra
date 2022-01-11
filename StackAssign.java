package assignment;

import java.util.Stack;

public class StackAssign {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	 { 
	      
	     Stack stack1 = new Stack();

	     // pushing the elements 
	     stack1.push("orange"); 
	     stack1.push("mango"); 
	     stack1.push("banana");
	     stack1.push("apple"); 
	     stack1.push("watermelon");
	     
	     stack1.push("Hyderabad"); 
	     stack1.push("Bangalore"); 
	     stack1.push("delhi");
	     stack1.push("Mumbai"); 
	     stack1.push("Manglore");
	     
	     stack1.push(35); 
	     stack1.push(77); 
	     stack1.push(82);
	     
	     stack1.push("n");
	     stack1.push("w");
	     System.out.println(stack1); 
	     stack1.pop(); 
	     stack1.pop(); 
	     stack1.pop();
	     
	     stack1.pop();
	     stack1.pop();
	     

	     
	     
	     // Fetching the element at the head of the Stack 2
	     System.out.println("The element at the top of the"+ " stack-2 is: " + stack1.peek()); 
	     stack1.pop();
	     stack1.pop();
	     stack1.pop();
	     stack1.pop();
	     // Priniting the Stack Elements
	     System.out.println("The element at the top of the"+ " stack-2 is: " + stack1.peek()); 
	     stack1.indexOf("apple");
	     stack1.indexOf("delhi");
	     System.out.println(stack1); 
	      
	     
	      
	 } 

}
