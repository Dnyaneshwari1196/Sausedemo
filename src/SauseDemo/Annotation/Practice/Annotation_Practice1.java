package SauseDemo.Annotation.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Practice1 
{
     //Third method
	
	 @AfterMethod
	 public void aftermethod()
	 {
		 System.out.println("add aftermethod");
	 }
	 
	 //First method
	 
	 @BeforeMethod
	 public void beforemethod()
	 {
		 System.out.println("add before method");
	 }
	 
	 //second method
	 
	 @Test
	 public void loginTestcase()
	 {
		 System.out.println("loginTestcase");
	 }
	 
	 
}
