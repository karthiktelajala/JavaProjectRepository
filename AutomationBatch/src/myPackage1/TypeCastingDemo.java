package myPackage1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
//		double d = 12.3;
//		float f = (float)d;
		
		Parent1 p = new Child1();  //Upcasting --> assigning the child class object to the parent class reference variable
		Child1 c = (Child1)p; //Downcasting 
		c.print();
	}

}
class Parent1
{
	public void display(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void acting()
	{
		System.out.println("Parent starterd acting");
	}
}
class Child1 extends Parent1
{
	public void display(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public void print()
	{
		System.out.println("System started printing");
	}
}