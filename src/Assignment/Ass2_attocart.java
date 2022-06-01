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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Ass2_attocart
{
	static WebDriver driver;
	
   public static void Screenshot1() throws IOException
   {
   Date d = new Date();
   DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
   String date = d1.format(d);
   
   TakesScreenshot ts = (TakesScreenshot)driver;
   File sourcefile = ts.getScreenshotAs(OutputType.FILE);
   File destfile = new File("E:\\Automation Screenshot\\.SS"+date+"jpg");
   FileHandler.copy(sourcefile, destfile);
   }
   public static void main(String[] args) throws IOException, InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
       driver = new ChromeDriver();
   
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       Screenshot1();
       
       Actions act = new Actions (driver);
       
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
       
       Screenshot1();
       
       WebElement textbar = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
       textbar.sendKeys("doveshapoo");
       
       WebElement searchbutt = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
       act.click(searchbutt).perform();
       
       Thread.sleep(2000);
       Screenshot1();
       
       WebElement product = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none _bXVsd_container_1DI1V _bXVsd_block_1vI8- _bXVsd_hFull_2lnNw _bXVsd_wFull_3f8b2 _bXVsd_row_3CEm0 _bXVsd_itemsCenter_3flfN _bXVsd_contentCenter_3BjNx'])[1]"));
       act.click(product).perform();
       
       Thread.sleep(2000);
       Screenshot1();
       
       WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
       act.click(addtocart).perform();
       
       WebElement loginbutt2 = driver.findElement(By.xpath("(//span[contains(@class,'nav-line-2')])[3]"));
       act.moveToElement(loginbutt2).perform();
       
       WebElement signout = driver.findElement(By.xpath("//span[text()='Sign Out']"));
       act.click(signout).perform();
       
       Thread.sleep(2000);
       Screenshot1();
       
       String expectedresult = "Amazon Sign In";
       String actualresult = driver.getTitle();
       
       if(expectedresult.equals(actualresult))
       {
    	   System.err.println("signout successful");
       }
       else
       {
    	   System.out.println("signout fail");
       }
   
   
   }
}