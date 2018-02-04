package myPackage1;

public class MethodOverridingDemo {

	public static void main(String[] args) {
	
		Child c = new Child();
		Child.display(10, 20);
		Parent.display(10, 20);
		c.acting();  //which method body needs to be invoked will be decided during runtime
		
	}
}

class Parent
{
	public static void display(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void acting()
	{
		System.out.println("Parent starterd acting");
	}
}
class Child extends Parent
{
	public static void display(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public void print()
	{
		System.out.println("System started printing");
	}
}