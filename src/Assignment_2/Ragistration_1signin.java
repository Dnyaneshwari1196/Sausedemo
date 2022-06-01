package Assignment_2;

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

public class Ragistration_1signin 
{
  static WebDriver driver;
  
  public static void Screenshot() throws IOException
  {
	  Date d = new Date();
	  DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
	  String date = d1.format(d);
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	  File destFile = new File("E:\\Automation Screenshot\\.SS"+date+"jpg");
	  FileHandler.copy(sourceFile, destFile);
  }
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get("http://practice.automationtesting.in/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions act = new Actions(driver);
	
	WebElement myacc = driver.findElement(By.xpath("//a[text()='My Account']"));
	act.click(myacc).perform();
	
	WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	username.sendKeys("dnyaneshwaridhepe01@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]"));
	password.sendKeys("mayu@010196");
	
	WebElement ragibutt = driver.findElement(By.xpath("//input[@type='submit']"));
	act.click(ragibutt).perform();
	
    Thread.sleep(2000);
			
    String expectedresult = "My Account &#8211; Automation Practice Site";
    String actualresult = driver.getTitle();
    
    System.out.println(actualresult);
    
    if(expectedresult.equals(actualresult))
    {
    	System.out.println("sucessful");
    }
    else
    {
    	System.out.println("fail");
    }
  
  
  
  
  
  }
  
}
