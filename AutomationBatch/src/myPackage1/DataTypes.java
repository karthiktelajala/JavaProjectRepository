package myPackage1;

public class DataTypes {

	
	static float f;
	static double d;
	static boolean bool;
	static char c;
	public static void main(String[] args) {
		
		//primitive data types
		
		
		//Creating Object of a Class
		// ClassName objectName = new ClassName();
		DataTypes2 obj = new DataTypes2();
		obj.nonFractionalDatatypes();
		
		DataTypes.fractionalDatatypes();
	}
	
	public static void fractionalDatatypes()
	{
		int a  = 10;
		f = 3.4f;
		d = 7.98;
		bool = true;
		c = 'h';
		
		System.out.println("default value of f: " +f);
		System.out.println("default value of d: " +d);
		System.out.println("default value of bool: " +bool);
		System.out.println("default value of c: " +c);
		System.out.println(a);
	}
}

class DataTypes2
{
	static byte b;
	static short s;
	static int i;
	static long l;
	protected void nonFractionalDatatypes()
	{
		b =6;
		s = 12;
		i = 343;
		l = 4847;
		System.out.println("b default value: " +b);
		System.out.println("s default value: " +s);
		System.out.println("i default value: " +i);
		System.out.println("l default value: " +l);
	}
	
}
