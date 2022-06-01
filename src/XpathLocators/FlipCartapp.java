package XpathLocators;

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
import org.openqa.selenium.io.FileHandler;

public class FlipCartapp

{    
	static WebDriver driver;             //----->declare globle veriable driver...which we declare always in class

	public static void Screenshotmeathod() throws IOException
	
	{
		//date
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		//Screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\Automation Screenshot\\SS"+date+".jpg");
		FileHandler.copy(sourceFile, destFile);
		
		}
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	 driver = new ChromeDriver();                   //----->already use WebDriver is class
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Screenshotmeathod();
	
	
//	WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//	login.click();
//	
//	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
//	email.clear();
//	email.sendKeys("8329321637");
//	
//	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//	password.clear();
//	password.sendKeys("Aishwarya1234");
//	
//	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
//	loginbutton.click();
//	
//	
//    Thread.sleep(2000);
//	Screenshotmeathod();
	
	
	WebElement popupclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	popupclose.click();
	
	WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
	boolean result = searchbar.isEnabled();
	System.out.println(result);
	
	if(result == true);
	{
		searchbar.sendKeys("lipstick");
		searchbar.click();
	}
	   Thread.sleep(2000);
	   Screenshotmeathod();
	   
	   
	   WebElement searchbtn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	   searchbtn.click();
	   
	   Thread.sleep(2000);
	   Screenshotmeathod();
	   
	
	
	
	
	
	
	
}
}