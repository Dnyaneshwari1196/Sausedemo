package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe1 
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
	
	System.out.println("Browser Opened");
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
	System.out.println("URL Opened");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement Frame = driver.findElement(By.xpath("//iframe[contains(@id, 'frame2')]"));
	
	driver.switchTo().frame(Frame);
	System.out.println("Focus switch to Iframe");
	
	WebElement Dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
	Dropdown.click();
	
	System.out.println("Dropdown is opened");
	
	Select s = new Select(Dropdown);
	
	s.selectByVisibleText("Big Baby Cat");
	
	System.out.println("Big Baby Cat - Element is selected");
}
}
