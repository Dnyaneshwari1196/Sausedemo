package SauseDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SosDemo.PomClass.HomePagePomClass;



public class TC02SelectProduct extends TestBaseClass
{

 
    	 @Test
    	 public void selectproduct() throws InterruptedException
    	 {
    	 String Expectedtitle = "Swag Labs";
 	     String Actualtitle = driver.getTitle();
 	     
 	     SoftAssert sa = new SoftAssert();
 	    		 
 	     sa.assertEquals(Actualtitle, Expectedtitle);
 	     sa.assertAll();
    	 }
    	 
	
	     @Test
	     public void selectproduct1() throws InterruptedException
	     { //object of home page
    	 HomePagePomClass hp = new HomePagePomClass(driver);
    	 
    	 hp.addSingleProduct();
    	 System.out.println("select single product");
    	 
    	// Thread.sleep(2000);
    	 
    	 }
    	 
    	 
//    	 @AfterMethod
//    	 public void teardown()
//    	 {
//    	 String Expectedtitle1 = "Swag Labs";
//    	 String Actualtitle1 = driver.getTitle();
//    	 
//    	 if(Expectedtitle1.equals(Actualtitle1))
//    	 {
//    		 System.out.println("testcase pass");
//    	 }
//    	 else
//    	 {
//    		 System.out.println("testcase fail");
//    	 }
    	 
//
//    		 driver.quit();
//    		 System.out.println("end the program");
    	 
    	
    	  
    	  
      }
      
