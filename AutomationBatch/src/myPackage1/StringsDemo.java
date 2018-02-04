package myPackage1;

public class StringsDemo {

	public static void main(String[] args) {
		
		//Using Literals
		String s1 = "Testing";
		String s2 = "Testing";
		String s3 = "Class";
		
		String s7 = s1.concat("Class");
		System.out.println(s1); //Testing
		
		//Using new Keyword:
		String s4 = new String("Testing");
		String s5 = new String("Testing");
		String s6 = new String("Class");
		
		
		//Comapring Strings:
		//1. == //it compares the references are pointing to the same String vlaue or not
//		System.out.println(s1==s4); //false
//		System.out.println(s1==s2); //true
//		System.out.println(s4==s5); //false
		
		//2. equals()  //it compare the String Values are same or not 
//		System.out.println(s1.equals(s4));//true
//		System.out.println(s1.equals(s2)); //true
//		System.out.println(s4.equals(s5)); //true
//		System.out.println(s1.equals(s3)); //false
//		System.out.println(s4.equals(s6)); //false
		
		//3. compareTo()
		// s1 == s2 ==> 0
		// s1>s2 ==>1
		// s1<s2 ==>-1
		
		System.out.println(s1.compareTo(s4));//true
		
	}

}
