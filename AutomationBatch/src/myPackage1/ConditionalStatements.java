package myPackage1;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
//		if(a<b)
//		{
//			System.out.println("a is bigger"); // true block 
//		}
//		else if (a>=10)
//		{
//			System.out.println("a is greater than 10");  
//		}
//		else
//		{
//			System.out.println("a is not greater than b & also 10");
//		}
		
		//nested if:
		
//		if (a>b)
//		{
//			if(a>=10)
//			{
//				System.out.println("a is greater than b & value is greater or equal to 10");
//			}
//			else 
//			{
//				System.out.println("a is greater than b, but it is not greater or equal to 10");
//			}
//		}
//		else
//		{
//			System.out.println("a is not greater than b");
//		}
		
		//5.switch case...
		int marks = 60;
		switch(marks)
		{
		case 70:
			System.out.println("First Class");
			break;
		case 50:
			System.out.println("Second Class");
			break;
		case 30:
			System.out.println("Third Calss");
			break;
		default:
			System.out.println("Sorry, you are failed");
		}
		
		System.out.println("Control Came out of the If block");
	}

}
