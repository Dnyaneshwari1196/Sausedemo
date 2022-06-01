package SauseDemo.TestCases;

import org.testng.annotations.Test;

import SosDemo.PomClass.HomePagePomClass;

public class TC01_BaseClassLogin extends TestBaseClass
{
	@Test
	public void loginfunctionality() throws InterruptedException
	{
		 String Expectedtitle = "Swag Labs";
	 	    String Actualtitle = driver.getTitle();
	 	    
	 	    if(Expectedtitle.equals(Actualtitle))
	 	    {
	 	    	System.out.println("testcase pass");
	 	    }
	 	    else
	 	    {
	 	    	System.out.println("testcase is failed");
	 	    }
	    	 
	    	 
	    	 //object of home page
	    	 HomePagePomClass hp = new HomePagePomClass(driver);
	    	 
	    	 hp.addSingleProduct();
	    	 System.out.println("select single product");
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 }
	    	 
	
    
}
