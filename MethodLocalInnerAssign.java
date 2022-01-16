package practicejava;


class Outer { 
	
	private String type1="Bigger";
	private String type2="Smaller";
	
    void Engine() { 
        System.out.println("We are using Method local inner class in engine type"); 
        
        class Inner { 
            void EngineType() { 
                System.out.println("Engine Type for 8WD=" +type1); 
                System.out.println("Engine Type for 4WD=" +type1); 
                System.out.println("Engine Type for 8WD=" +type2); 
                System.out.println("Engine Type for 4WD=" +type2); 
            } 
        } 
        Inner y = new Inner();  
        y.EngineType();   
    } 
} 

public class MethodLocalInnerAssign{ 
    public static void main(String[] args) { 
        Outer l= new Outer(); 
        l.Engine();   
    } 
} 


