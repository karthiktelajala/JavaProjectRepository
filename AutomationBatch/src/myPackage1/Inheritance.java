package myPackage1;

public class Inheritance {

	public static void main(String[] args) {
		
		Son s = new Son();
		s.forming();

	}

}

class GrandFather
{
	String name;
	int age;
	
	public void forming()
	{
		System.out.println("forming from GrandFather");
	}	
}

class Father extends GrandFather
{
	String hobby;
	public void business()
	{
		System.out.println("Business of Father");
	}
}

class Son extends GrandFather
{
	int salary;
	public void job()
	{
		System.out.println("Son is doing JOB");
	}
}