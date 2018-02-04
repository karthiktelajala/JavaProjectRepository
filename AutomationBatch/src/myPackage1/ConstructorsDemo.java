package myPackage1;

public class ConstructorsDemo {

	public static void main(String[] args) {
		
		conClass2 obj = new conClass2();
		
		

	}

}

class conClass
{
	int a;
	int b;
	conClass()
	{
		System.out.println("default Constructor of conClass is invoke");
	}
	
	conClass(int a)
	{
		System.out.println("conClass Constructor with single parameter is invoked");
		this.a = a;
		System.out.println("a value is initialized as: "+a);
	}
	
	conClass(int a, int b)
	{
		System.out.println("conClass Constructor with single parameter is invoked");
		this.a = a;
		this.b = b;
		System.out.println("a value is initialized as: "+a);
		System.out.println("b value is initialized as: "+b);
	}
}

class conClass2 extends conClass
{
	conClass2()
	{
		System.out.println("default constructor of conClass2 is invoked");
	}
}