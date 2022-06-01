package Assignment;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.poifs.crypt.dsig.services.TSPTimeStampService;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Ass1 
{     
	   static WebDriver driver;
       public static void Screenshot() throws IOException
       {
    	   Date d = new Date();
    	   DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
    	  String date =  d1.format(d);
    	  
    	  TakesScreenshot tc = (TakesScreenshot)driver;
    	  File SourceFile = tc.getScreenshotAs(OutputType.FILE);
    	  File DestFile = new File("E:\\Automation Screenshot\\.SS"+date+"jpg");
    	  FileHandler.copy(SourceFile, DestFile);
       }
       public static void main(String[] args) throws InterruptedException
       {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    Actions act = new Actions(driver);
	    
		WebElement LoginWin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		act.moveToElement(LoginWin).perform();
		
	//	Thread.sleep(2000);
		//Screenshot();
		
		WebElement SignInBtn = driver.findElement(By.xpath("(//span[contains(text(), 'Sign in')])[2]"));
		act.click(SignInBtn).perform();
		
		WebElement UserName = driver.findElement(By.xpath("//input[contains(@id, 'ap_email')]"));
		UserName.sendKeys("9075143654");
//        
        WebElement continuebut = driver.findElement(By.xpath("//input[@id='continue']"));
        act.click(continuebut).perform();
       
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Vidhu@2020");
        
        WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        act.click(signin).perform();
//        
        Thread.sleep(3000);
        
        String expectedresult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualresult = driver.getTitle();
        
        System.out.println(actualresult);
        
        if(expectedresult.equals(actualresult))
        {
           System.out.println("sign in successful");
        }
        else
        {
        	System.out.println("sign in fail");
        }
        
        Thread.sleep(3000);
        
        WebElement LoginWin2 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        act.moveToElement(LoginWin2).perform();
        
        Thread.sleep(3000);
        
        WebElement signout = driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
        act.click(signout).perform();
        
        Thread.sleep(3000);
        
       String expectedresult2 = "Amazon Sign In";
       String actualresult2   = driver.getTitle();
       
       System.out.println(actualresult2);
       
       if(expectedresult2.equals(actualresult2))
       {
    	   System.out.println("sign out successful");
       }
       else
       {
    	   System.out.println("sign out fail");
       }
       }
       
       
       
       
       
       
       
}
