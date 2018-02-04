package myPackage1;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		EncapClass ec = new EncapClass();
		ec.setId(10);
		ec.setName("Tarun");
		ec.setSalary(30000);
		System.out.println(ec.getId() + " " + ec.getName() + " " + ec.getSalary());
		ec.setId(12);
		ec.setName("Hiran");
		ec.setSalary(25000);
		System.out.println(ec.getId() + " " + ec.getName() + " " + ec.getSalary());
		
		

	}

}

class EncapClass
{
	private int id;
	private String name;
	private int salary;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
