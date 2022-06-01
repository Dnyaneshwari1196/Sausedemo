package XpathLocators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SwagLab 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[1]/input"));
	username.sendKeys("standard_user");
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/input"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/input"));
	login.click();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File("E:\\Automation study\\url.jpg");
	FileHandler.copy(sourceFile, destFile);
}	

}
