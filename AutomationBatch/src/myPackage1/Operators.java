package myPackage1;

public class Operators {

	public static void main(String[] args) {
		
		//1. Unary Operators:
		//Postfix: expr++, expr--
		//Prefix: ++expr, --expr
		//!
//		int  a = 7;
//		if(!(a>10))
//		{
//			System.out.println("a values is less than or equal to 7");
//		}
//		System.out.println(a++);
//		System.out.println(a);  //8
//		System.out.println(a--); 
//		System.out.println(a); //7
//		System.out.println(--a); //6
//		System.out.println(++a);//7
		
		//2. Arithemic Operators:
		//Multiplicative: *, /, %
		//Additive: +, -
//		int a = 15;
//		int b = 7;
//		System.out.println(a*b); //105
//		System.out.println(a/b); //2
//		System.out.println(a%b);//1
//		System.out.println(a+b); //22
//		System.out.println(a-b); //8
		
		//3. Shift Operators:
		// <<, >>, >>>
//		int a  =10;
//		int b = 3;
//		System.out.println(a<<b); //a*2^b ==> 10*2^3===>10*8 ==> 80
//		System.out.println(a>>b); //a/2^b ==> 10/2^3===>10/8 ==> 1
//		System.out.println(a>>>b);
		
		//4. Relational Operators:
		//Comparision: >, <, <=, >=
		//Equality: ==, !=
//		int a = 10;
//		int b = 5;
//		System.out.println(a>b); //true
//		System.out.println(a<b); //false
//		System.out.println(a>=b); //true
//		System.out.println(a<=b); //false
//		System.out.println(a==b); //false
//		System.out.println(a!=b);  //true
		
		//5. Bitwise Operators:
		//Bitwise AND: &
		//Bitwise OR: |
//		int a = 10;
//		int b = 5;
//		if(a<b & a>=10)
//		{
//			System.out.println("Conditions passed");
//		}
//		
//		if(a>b | a>10)
//		{
//			System.out.println("Bitwise OR - One of  the Conditions passed");
//		}
		//6. Logical Operators:
		//Logical AND: &&
		//Logical OR: ||
//		if(a<b && a>=10)
//		{
//			System.out.println("Conditions passed");
//		}
//		
//		if(a>b || a>10)
//		{
//			System.out.println("Logical OR - On of the Conditions passed");
//		}
		
		//7. Ternary Operator: ? :
		
//		int a = 10;
//		int b =5;	
//		System.out.println((a>b)?a:b); //(Conditions)?trueblock:falseblock
		
		//8. Assignment Operators:
		// =, +=, -+, *=,/=,%=
		int a = 10;
		a+= 20;
		System.out.println(a);
	}
}
