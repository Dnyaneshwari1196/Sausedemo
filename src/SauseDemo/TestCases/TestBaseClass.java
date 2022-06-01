package SauseDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import SosDemo.PomClass.LoginPgePomClass;

public class TestBaseClass 
{
        WebDriver driver;
        
        @Parameters("browserName")    
        @BeforeMethod
        
        public void SetUp( String browserName) throws InterruptedException
        {
        	 if(browserName.equals("Chrome"))
        		
        	{	
        	 System.setProperty("webdriver.chrome.driver",
 					"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
     	 
        	 driver = new ChromeDriver();
         	 System.out.println("chrome Browser is open");
        }
        	 
        	
        else if(browserName.equals("Firefox"))
        	
       
        {
       	     System.setProperty("webdriver.gecko.driver",
       	    		"C:\\Users\\Dell\\Desktop\\sele\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
     	 
       	     driver = new FirefoxDriver();
       	     System.out.println("open firefox browser");
        }
        	 
       
        else
        	 
        {
        	System.setProperty("webdriver.edge.driver",
        			"C:\\Users\\Dell\\Desktop\\sele\\edgedriver_win64\\msedgedriver.exe");
        	
        	driver = new EdgeDriver();
        }
        	 
        	 
        	 driver.manage().window().maximize();
     	 
        	 driver.get("https://www.saucedemo.com/");
        	 System.out.println("URL open");
     	 
        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	 
     	 
     	 //object of login page
     	 LoginPgePomClass lp = new LoginPgePomClass(driver);
     	 
     	 lp.sendUsername();
     	 System.out.println("Entered username");
     	 
     	 Thread.sleep(2000);
     	  
     	 lp.sendPassword();
     	 System.out.println("Entered password");
     	 
     	 Thread.sleep(2000);
     	 
     	 lp.clickLoginbutt();
     	 System.out.println("click on login button");
     	 
     	 Thread.sleep(2000);
       } 
        
        
        
        @AfterMethod
        public void teardown()
        {
        	driver.quit();
        	System.out.println("end the program");
       
        }

       
}
