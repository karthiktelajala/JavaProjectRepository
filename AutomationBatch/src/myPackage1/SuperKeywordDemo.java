package myPackage1;

public class SuperKeywordDemo {

	public static void main(String[] args) {
		
		Class2  c2 = new Class2(10,20);
		

	}

}
class Class1
{
 int a; //10
 int b; //20
 Class1()
 {
  System.out.println("This is Class1 Constructor");
 }

 public void display()
 {
  System.out.println("Display a + b value: "+ ( a+b));
 }
}

class Class2 extends Class1
{
	Class2()
	{
		super();
	}
	Class2(int a, int b)
	{
		super.a = a;
		super.b = b;
		super.display();
	}
}
