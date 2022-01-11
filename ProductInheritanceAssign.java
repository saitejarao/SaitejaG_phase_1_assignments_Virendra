package assignment;
class product {
    int id=78;
    String ProductName="Amul";
public void displayproduct()
{
	System.out.println("Product id:"+id);
	System.out.println("Product name:"+ProductName);
}
}
class Butter extends product{
int count=50;
String category="butter";
public void displayButter()
{
System.out.println("Product name:"+ProductName);
System.out.println("category is:"+category);
//count++;
}
}
class type extends Butter{
int price =30;
public void displaytype()
{
System.out.println("price:"+price);
System.out.println("id:"+id);
System.out.println("name of the product:"+ProductName);
System.out.println("Category is:"+category);
System.out.println("Total price:"+(count*price));
}
}
class B extends product{
int count=90;
String category="Milk";
public void displayB()
{
System.out.println("company name:"+ProductName);
System.out.println("category is:"+category);
//count++;
}
}
class subB extends B{
int price =10;
public void displaysubB()
{
System.out.println("price:"+price);
System.out.println("id:"+id);
System.out.println("name of the product:"+ProductName);
System.out.println("Category is:"+category);
System.out.println("Total price:"+(count*price));
}
}
class C extends product{
	int count=56;
	String category="choco";
	public void displayC()
	{
	System.out.println("company name:"+ProductName);
	System.out.println("category is:"+category);
	//count++;
	}	
}
public class ProductInheritanceAssign {
	public static void main(String args[])
	{
		product obj=new product();
		obj.displayproduct();
		
		Butter obj1=new Butter();
		obj1.displayButter();
		
		type obj2=new type();
		obj2.displaytype();
		
		B obj3=new B();
		obj3.displayB();
		
		subB h=new subB();
		h.displaysubB();
		C g=new C();
		g.displayC();
	}
}
