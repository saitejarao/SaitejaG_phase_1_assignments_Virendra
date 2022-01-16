package program.accessmodifier.p2;

import program.acessmodifier.p1.M;
import program.acessmodifier.p1.N;

public class Y extends N{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("methods of M class");
     M obj=new M();
     obj.methodPublic();
   //  new M().methodPublic();
     
     System.out.println("methods of N class");
     new N().methodPublic();
     
     System.out.println("Variables of X class");
     System.out.println("value of f:"+new X().f);
     System.out.println("value of l:"+new X().l);
     System.out.println("value of j:"+new X().j);
	}

}
