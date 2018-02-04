package myPackage1;

public class BreakContinue {

	public static void main(String[] args) {
		
		int a = 10;
		
		for (int i = 0; i < a; i++) 
		{
			if(i==5)
			{
				//break; //it break the loop and control comes out of the loop
				continue; //it breaks only the current iteration and continue the next iterations
			}
			System.out.println(i);
		}
	}
}
