package program.accessmodifier.p2;

import program.acessmodifier.p1.M;
import program.acessmodifier.p1.N;
import program.acessmodifier.p1.P;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("methods of M class");
		M obj=new M();
		obj.methodPublic();
	    // new M().methodPublic();
	     
	     System.out.println("methods of N class");
	     new N().methodPublic();
	     
	     System.out.println("methods of P class");
	     new P().methodPublic();
	     
	     System.out.println("Variables of X class");
	     X obj1=new X();
	     System.out.println("value of f:"+obj1.f);
	     System.out.println("value of l:"+obj1.l);
	     System.out.println("value of j:"+obj1.j);
	}

}
