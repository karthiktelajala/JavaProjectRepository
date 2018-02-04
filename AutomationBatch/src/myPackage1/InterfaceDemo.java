package myPackage1;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		iEmployee ie = new Employee(); //upcasting
		
		ie.administration();
		
		Employee e = (Employee)ie; //downcasting
		e.programming();
		e.testing();
		e.administration();
		e.maintainance();
		e.eating();
		
	}

}

interface iParent
{
	void business();
}
interface iHuman 
{
	void eating();
	void sleeping();
}

interface iEmployee extends iParent, iHuman
{
	String company = "Eurofins";
	String address = "ITPL";
	
	void programming();
	void testing();
	void administration();
}


class Employee implements iEmployee
{
	public void business()
	{
		System.out.println("Employee is also having Business");
	}
	public void eating()
	{
		System.out.println("Employee is eating");
	}
	public void sleeping()
	{
		System.out.println("Employee is sleeping");
	}
	public void programming()
	{
		System.out.println("Employee is Programming");
	}
	public void testing()
	{
		System.out.println("Employees is Testing");
	}
	public void administration()
	{
		System.out.println("Employee is Administrating");
	}
	public void maintainance()
	{
		System.out.println("Employee is Maintaining");
	}
}