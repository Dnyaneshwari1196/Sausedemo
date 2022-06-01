package KeyWordsInSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SauseDemo.TestCases.TestBaseClass;
import SosDemo.PomClass.HomePagePomClass;

public class KeywordPractice 
{   
	@Test(priority = 1,invocationCount = 0)
	public void TestA()
	{
		System.out.println("Test A");
	}
	
	@Test
	public void TestB()
	{
		System.out.println("Test B");
	}
	
	@Test(invocationCount = 2)
	public void TestC()
	{
		System.out.println("Test C");
	}
	
	@Test(priority = -1)
	public void TestD()
	{
		System.out.println("Test D");
	}
	
	@Test(priority = 2)
	public void TestE()
	{
		System.out.println("Test E");
	}
    
}
