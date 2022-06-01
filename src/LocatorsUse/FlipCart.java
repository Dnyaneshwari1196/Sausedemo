package LocatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.className("_2IX_2- VJZDxU"));
	username.sendKeys("8329321637");
	
	WebElement password = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
	password.sendKeys(" Velocity@123");
	
	WebElement login = driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL"));
	login.click();
	
	
//	WebElement forgot = driver.findElement(By.linkText("Forgot?"));
//	forgot.click();
	
	 
//	WebElement signup = driver.findElement(By.linkText("New to Flipkart? Create an account"));
//	signup.click();
	
	
	
	
	
}
}
