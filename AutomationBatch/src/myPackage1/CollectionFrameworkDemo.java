package myPackage1;

import java.util.HashMap;


public class CollectionFrameworkDemo {

	public static void main(String[] args) {

//		ArrayDeque<String> hs = new ArrayDeque<String>();
//		
//		hs.add("String1");
//		hs.add("Test1");
//		hs.add("Result1");
//		hs.add("Answer1");
//		hs.add("Question1");
//		hs.add("LatestElement");
		
		//Using Iterator:
//		Iterator<String> itr = hs.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Using for each:
//		for(String s : hs)
//		{
//			System.out.println(s);
//		}
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "TestName1");
		hm.put(102, "Value2");
		hm.put(104, "Class2");
		
		System.out.println(hm.get(102));
		
		
	}
}
