package myPackage1;

public class MethodOverloading {

	public static void main(String[] args) {
		OverLoadedClass olc = new OverLoadedClass();
		olc.display(30);
		olc.display(20, 10);
		olc.display(10,5.5f);
		olc.display(7.4f,6);
	}

}

class OverLoadedClass
{
	void display()
	{
		System.out.println("display method without parameters");	
	}
	void display(int a)
	{
		System.out.println("display method with one parameter");	
	}
	void display(int a, int b)
	{
		System.out.println("display method with two parameters (int, int)");	
	}
	void display(int a, float b)
	{
		System.out.println("display method with two parameters (int, float)");	
	}
	void display(float a, int b)
	{
		System.out.println("display method with two parameters (float, int)");	
	}
	
}
