package myPackage1;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int a = 15;
		Integer i1 = new Integer(a);
		System.out.println(i1);   //boxing
		
		Integer i2 = new Integer(10); 
		int b = i2.intValue();  //unboxing
		System.out.println(b);

	}

}
