package practicejava;

public class ThreadAssignment extends Thread{
	public void run(){
		 for(int i=1;i<4;i++){  
			    try{
			    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
			    	}
			    catch(InterruptedException e)
			    {
			    	System.out.println(e);
			    }  
			    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
			  }  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
		   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
		
		  }  
		
		 public static void main(String args[]){  
		  
			 ThreadAssignment m1=new ThreadAssignment();  
			 ThreadAssignment m2=new ThreadAssignment();  
			 ThreadAssignment m3=new ThreadAssignment();
		  
		  m1.setName("IT");
		  m2.setName("Finance");
		  m3.setName("HR");
		 
		  m1.start();  
		  m2.start();  
		  m3.start();
		   
		 }  
}
