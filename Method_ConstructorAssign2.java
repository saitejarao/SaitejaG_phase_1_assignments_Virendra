package assignment;

class calculate
{
	calculate(int a)
	{
		a=a;
	}
	calculate(int l,float w)
	{
		l=l;
		w=w;
	}
	calculate(float f)
	{
		f=f;
	}
	calculate()
	{
		System.out.println("default constructor");
	}
	public void area(int l, float w)
	{
		System.out.println("area of rectangle "+(l*w));
	}
	public void area(float f)
	{
		System.out.println("area of circle "+(f*f));
	}
	public void area(int a)
	{
		System.out.println("square "+(a*a));
	}
	public void area(long p,int q)
	{
		System.out.println("area of rhombus "+((p*q)/2));
	}
	public void area(int c,int b)
	{
		System.out.println("square "+((c*b)/2));
	}	
}

public class Method_ConstructorAssign2 {
	public static void main(String[] args) {
calculate c=new calculate();
		
		c.area(7,3f);
		c.area(9.5f);
		c.area(4);
		c.area(9l,4);
		c.area(5,3);
		

	}
}
