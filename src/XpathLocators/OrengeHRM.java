package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrengeHRM 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	// login
//	WebElement username =   driver.findElement(By.xpath(" //input[@id='txtUsername']"));
//	username.sendKeys("Admin");
//	Thread.sleep(2000);
//
//	WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//	password.sendKeys( "admin123");
//	Thread.sleep(2000);
//	
//	WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//	login.click();
//	Thread.sleep(2000);
	

//	WebElement myinfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
//	myinfo.click();
	
	//forgot password
	WebElement forgot = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']"));
	forgot.click();
	
	
	WebElement reset = driver.findElement(By.xpath("//input[@id='securityAuthentication_userName']"));
	reset.sendKeys("Admin");
	
	
	WebElement resetpass = driver.findElement(By.xpath("//input[@id='btnSearchValues']"));
	resetpass.click();
	
	
	
	
	
}
}
