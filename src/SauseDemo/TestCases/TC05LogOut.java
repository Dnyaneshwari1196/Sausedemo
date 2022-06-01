package SauseDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import SosDemo.PomClass.HomePagePomClass;
import SosDemo.PomClass.LoginPgePomClass;

public class TC05LogOut extends TestBaseClass
{
	 @Test
		public void loginFuction()
		{
			   
		    HomePagePomClass hp = new HomePagePomClass(driver);
		   
		    hp.clickMenuButton();
		    System.out.println("hamberger open");
		    
		    hp.clickLogOutButton();
		    System.out.println("logout");

		    
		}		    
}
