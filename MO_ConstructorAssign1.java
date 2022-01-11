package assignment;



class calucate
{
public void add(int a,int b)
{
	System.out.println("sum of two="+(a+b));
}
public void area(int r)
{
	System.out.println("area of the circle="+(3.14*r*r));
}
public void area(int l,int b)
{
	System.out.println("area of the rectangle="+(l*b));
}
}
public class MO_ConstructorAssign1 {
	public static void main(String[] args) {
		calucate g=new calucate();
		g.add(10, 5);
		g.area(5);
		g.area(3,6);
	}
}
