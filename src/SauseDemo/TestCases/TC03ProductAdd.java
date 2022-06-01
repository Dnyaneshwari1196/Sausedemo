package SauseDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SosDemo.PomClass.HomePagePomClass;
import SosDemo.PomClass.LoginPgePomClass;

public class TC03ProductAdd extends TestBaseClass
{
	 @Test
		public void productadd()
		{
			
		    //object of home page
		    
		    HomePagePomClass hp = new HomePagePomClass (driver);
		    
		    hp.addSingleProduct();
		    System.out.println("click");
		    
		    System.out.println("product selected");
		    
		    
		    hp.clicksingleproduct();
		    System.out.println("click");
		    
		    System.out.println("product add");
		    
		    
		    
		    
		    
		    
		    
		    
}
}
