package assignment;
abstract class Vehicle1{
int speed=56;
long distance=345;
	abstract void run();
	abstract void stop();
	public void fuel(int a)
	{
		System.out.println("a value: "+a);
	}
	public void fuel(float g,String j)
	{
		System.out.println("g value: "+g);
		System.out.println("j value: "+j);
	}
	public void fuel(char s,int d)
	{
		System.out.println("s value: "+s);
		System.out.println("d value: "+d);
	}

Vehicle1()
{
	System.out.println("vehicle is used");
}
Vehicle1(int v,long b)
{
	v=speed;
	b=distance;
}
protected abstract void display();


}
class twoW1 extends Vehicle1{
	int speed=43;
	long distance=34566;
	int nos_of_tyre=2;
	void run()
	{
		System.out.println("2 wheeler is runing");
	}
	twoW1()
	{
	  System.out.println("two wheeler");	
	}
	public void display()
	{
		System.out.println("vehicle speed: "+super.speed);
		System.out.println("vehicle distance: "+super.distance);
		System.out.println("twoW speed: "+speed);
		System.out.println("twoW distance: "+distance);
		System.out.println("no of tyres of twoW: "+nos_of_tyre);
	}
	@Override
	void stop() {
		System.out.println("2 wheeler is stopped");	
	}
} 
class threeW extends Vehicle1{
int speed=83;
long distance=72467;
int nos_of_tyre=3;
void run()
{
	System.out.println("3 wheeler is runing");
}
threeW()
{
  System.out.println("three wheeler");	
}
public void display()
{
	System.out.println("vehicle speed: "+super.speed);
	System.out.println("vehicle distance: "+super.distance);
	System.out.println("threeW speed: "+speed);
	System.out.println("threeW distance: "+distance);
	System.out.println("no of tyres of threeW: "+nos_of_tyre);
}
@Override
void stop() {
	System.out.println("3 wheeler is stopped");	
	
}
}
class fourW extends Vehicle1{
int speed=58;
long distance=6380;
int nos_of_tyre=4;
void run()
{
	System.out.println("4 wheeler is runing");
}
fourW()
{
  System.out.println("four wheeler");	
}
public void display()
{
	System.out.println("vehicle speed: "+super.speed);
	System.out.println("vehicle distance: "+super.distance);
	System.out.println("fourW speed: "+speed);
	System.out.println("fourW distance: "+distance);
	System.out.println("no of tyres of fourW: "+nos_of_tyre);
}
@Override
void stop() {
	System.out.println("4 wheeler is stopped");	
	
}
}
class eightW extends Vehicle1{
int speed=92;
long distance=7435;
int nos_of_tyre=8;
void run()
{
	System.out.println("8 wheeler is runing");
}
eightW()
{
  System.out.println("eight wheeler");	
}
public void display()
{
	System.out.println("vehicle speed: "+super.speed);
	System.out.println("vehicle distance: "+super.distance);
	System.out.println("eight speed: "+speed);
	System.out.println("eight distance: "+distance);
	System.out.println("no of tyres of twoW: "+nos_of_tyre);
}
@Override
void stop() {
	System.out.println("8 wheeler is stopped");	
	
}
}
public class OOPSAbsractAssign1 {
public static void main(String[] args) {
		
		Vehicle1 obj=new twoW1();
	     obj.run();
	     obj.stop();
		obj.display();
	   Vehicle1 obj1=new threeW();
	     obj1.run();
	     obj1.stop();
		obj1.display();
		Vehicle1 obj2=new fourW();
	     obj2.run();
	     obj2.stop();
		obj2.display();
		Vehicle1 obj3=new eightW();
	     obj3.run();
	     obj3.stop();
		obj3.display();
        obj.fuel(5);
        obj.fuel(45,"sjkd");
        obj.fuel('d',9);
	}
}
