package assignment;

public class CustExceptionAssign {
	static void check(int salary)throws CheckSalary{  
	     if(salary<2100)  
	      throw new CheckSalary("you to need to work hard");  
	     else  
	     if(salary >= 2100 && salary <= 5000)  
	   	 throw new CheckSalary("you salary is somehow good");
	     else
	     if(salary >= 5100 && salary <= 9000)  
	     throw new CheckSalary("salary is very good");
	     
	   }  

	public static void main(String[] args) {
		try{  
	        check(3000);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
}
class CheckSalary extends Exception
{
	CheckSalary(String d){
		super(d);
	}
}