package SauseDemo.Annotation.Practice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2 
{
    
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("add before suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("add before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("add before class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("add before method");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("add test case1");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("add after method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("add after class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("add after test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("add after suite");
	}
}
