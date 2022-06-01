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

public class Ass3_MobileRecharge 
 {
		static WebDriver driver;
		
	  public static void Screenshot() throws IOException
	   {
		   Date d = new Date();
		   DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		  String date = d1.format(d);
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		  File destFile   = new File("E:\\Automation Screenshot\\.SS\"+date+\"jpg");
		  FileHandler.copy(SourceFile, destFile);
	   }
	   public static void main(String[] args) throws InterruptedException, IOException  
	   {
		   System.setProperty("webdriver.chrome.driver"," C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		   
	       driver = new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   Screenshot();
		   
		   Actions act = new Actions(driver);
		   
		   WebElement Loginbut = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	       act.moveToElement(Loginbut).perform();
	       
	       WebElement signinbutt = driver.findElement(By.xpath("(//span[contains(text(), 'Sign in')])[2]"));
	       act.click(signinbutt).perform();
	       
	       WebElement username = driver.findElement(By.xpath("//input[contains(@id, 'ap_email')]"));
	       username.sendKeys("9075143654");
	       
	       WebElement continuebutt = driver.findElement(By.xpath("//input[@id='continue']"));
	       act.click(continuebutt).perform();
	       
	       WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	       password.sendKeys("Vidhu@2020");
	       
	       WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	       act.click(signin).perform();
	       Thread.sleep(3000);
	       Screenshot();
	     
		   
		  
	}
 }
  

