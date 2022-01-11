package assignment;

public class NestedTryException {
public static void main(String[] args) {  
        
        try{    
             
            try { 
            	int b[]=new int[5];
                b[6]=9; 
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
         	   System.out.println("ArrayIndexOutOfBounds Exception occurs");    
            } 
            try { 
            	int b[]=new int[5];
                b[3]=20/0; 
            }
            catch(ArithmeticException e)
            {
         	   System.out.println("Arithmetic Exception occurs");    
            } 
        }     
          catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               } 
        
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
        
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }  
        
        finally{
     	   System.out.println("rest of the code");
     	   
        }
        
                
 }  
}
