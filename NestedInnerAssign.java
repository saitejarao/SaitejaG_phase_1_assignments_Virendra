package assignment;



public class NestedInnerAssign {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 
	  
	  void msg()
	  {
		  NestedInnerAssign.this.display();
		  System.out.println("data is "+data);
	  }  
	  
	  
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }
	  class A
	  {
		  void display1()
		  {
		  System.out.println("saiteja is in another inner class in the inner class");
		  }
	  }
	}
	 
	
	public static void main(String args[]){  
	  
		NestedInnerAssign obj=new NestedInnerAssign();     
	  
		NestedInnerAssign.Inner in=obj.new Inner();   
	  in.msg();  
	  in.display(); 
	 
	  Inner.A in1=in.new A();
	  in1.display1();
	 }  
}
