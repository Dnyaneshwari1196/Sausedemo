package SauseDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SosDemo.PomClass.HomePagePomClass;
import SosDemo.PomClass.LoginPgePomClass;

public class TC01LoginFunctionality extends TestBaseClass
{

    
    
	    @Test
	    public void loginfunctionalityTest() throws InterruptedException
	    {
	    
	    String Expectedtitle = "Swag Labs";
	    String Actualtitle = driver.getTitle();
	    
	    System.out.println("verify the testclass");
	    
	    // Hard assert
	    Assert.assertEquals(Actualtitle,Expectedtitle);
	    

	    
	    
	    
	    //object of homepage pom class
	    HomePagePomClass hp = new HomePagePomClass(driver);
	    
	    hp.clickMenuButton();
	    System.out.println("click on hamberger menu ");
	    
	    Thread.sleep(2000);  
	    
	    hp.clickLogOutButton();
	    System.out.println("click on logout");
	    
	    
	    String ExpectedTitle = "Swag Labs";
	    String ActualTitle = driver.getTitle();
	    
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	    	
 
        System.out.println("end the programm");


	    }	
}
