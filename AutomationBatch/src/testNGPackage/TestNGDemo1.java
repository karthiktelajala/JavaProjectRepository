package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {
  
	@BeforeSuite(groups ={"Sanity","Reg"})
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest(groups ={"Sanity","Reg"})
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(groups ={"Reg"})
	public void testCase1() 
	{	
		System.out.println("My First Test Case");
	}
	@Test(groups ={"Reg"})
	public void testCase2() 
	{	
		System.out.println("My Second Test Case");
	}
	
	@Test(groups ={"Sanity"})
	public void testCase3() 
	{	
		System.out.println("My Third Test Case");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest(groups ={"Sanity","Reg"})
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite(groups ={"Sanity","Reg"})
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
