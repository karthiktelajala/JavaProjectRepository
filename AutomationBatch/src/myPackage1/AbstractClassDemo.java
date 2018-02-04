package myPackage1;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		GeneralClass2 gc = new GeneralClass2();
		gc.art();
		gc.display();
		gc.dance();

	}

}

abstract class AbstractClass1
{
	public void display()
	{
		System.out.println("AbstractClass1 displaying");
	}
	
	abstract public void art();
}
abstract class GeneralClass1 extends AbstractClass1
{
	abstract public void dance();
	
}
class GeneralClass2 extends GeneralClass1
{
	public void art()
	{
		System.out.println("GeneralClass2 is implementing abstract method (art()) of AbstractClass1");
	}
	
	public void dance()
	{
		System.out.println("GeneralClass2 is implementing abstract method (dance()) of GeneralClass1");
	}
	
	
	
}




