package Assignment;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Ass_swaglab1_getTitle 
{
   static WebDriver driver;
   
   public static void screenshot() throws IOException
   {
	   Date d = new Date();
	   DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
	  String date  = d1.format(d);
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	  File destFile = new File("E:\\Automation Screenshot\\.SS"+date+"jpg");
	  FileHandler.copy(SourceFile, destFile);
   }
   
   public static void main(String[] args) throws IOException, InterruptedException
   {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	screenshot();
	
	Actions act = new Actions(driver);
	
	WebElement username = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
	username.sendKeys("standard_user");
	
	WebElement password =  driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
	password.sendKeys("secret_sauce");
	
	WebElement loginbutt = driver.findElement(By.xpath("//input[@type='submit']"));
	act.click(loginbutt).perform();
	
	screenshot();
	Thread.sleep(5000);
	
	String expectedresult = "Single Page Apps for GitHub Pages";
	String actualresult = driver.getTitle();
	
	System.out.println(actualresult);
	
	if(expectedresult.equals(actualresult))
	{
		System.out.println("title get successful");
	}
	else
	{
		System.out.println("failed");
	}
	
	Thread.sleep(3000);
	
	WebElement hamberger = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	act.click(hamberger).perform();
	
	Thread.sleep(3000);
	
	WebElement logout =  driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	act.click(logout).perform();
   
	screenshot();
	Thread.sleep(3000);
	
	String expectedresult1 = "Swag Labs";
	String actualresult1 = driver.getTitle();
	
	System.out.println(actualresult1);
	
	if(expectedresult1.equals(actualresult1))
	{
		System.out.println("title get successful");
	}
	else
	{
		System.out.println("failed");
	}
	
   
   }
	
  
   
   
   
   
   
   
   
   
   
   
   
}
