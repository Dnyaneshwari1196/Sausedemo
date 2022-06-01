package SauseDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SosDemo.PomClass.HomePagePomClass;
import SosDemo.PomClass.LoginPgePomClass;

public class TC04AddAllProduct extends TestBaseClass
{
	 @Test
		public void loginFuction()
		{
			
		    
		    HomePagePomClass hp = new HomePagePomClass(driver);
		    
		   hp.AddAllProduct();
		    System.out.println("All product add");
		    
		    
		    
		    
		    
		    
		}		    
}
