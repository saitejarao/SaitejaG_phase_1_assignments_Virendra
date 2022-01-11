package assignment;

public class TypecastingAssignment2 {
	public static void main(String[] args) {
		boolean member=true;
		System.out.println("iam printing "+member);
		char gender='M';
		System.out.println("Gender:"+gender);
		int age=20;
		System.out.println("age:"+age);
		long distance=384934374L;
		System.out.println("distance:"+distance);
		float percentage=45.55f;
		System.out.println("percentage:"+percentage);
		double pi=3.14988794959799;
		System.out.println("pi:"+pi);
		
		int i=97;
		long l=i;
		System.out.println("long value:"+l);
		
		int o=(int)l;
		System.out.println("int value:"+o);
		
		char t=(char)i;
		System.out.println("char value:"+t);
		
		double d=28398248.238928491;
		float f=(float) d;
		System.out.println("float value:"+f);
		System.out.println("double value:"+d);
		
		long l2=(long)d;
		int i2=(int)l2;
		System.out.println("long value:"+l2);
		System.out.println("int value:"+i2);
		System.out.println("double value:"+d);
		
		float ff=l;
		System.out.println("float value:"+ff);
		
		byte b;
		int ii=258;
		double dd=278.494;
		
		System.out.println("conversion of int to byte");
		b=(byte) ii;
		System.out.println("ii="+ii+ "b="+b);
		System.out.println("conversion of double to byte");
	    b=(byte)dd;
	    System.out.println("dd="+dd+ "b="+b);

	}
}
