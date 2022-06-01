package XpathLocators;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MouseFunction
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions act = new Actions(driver);
	
	WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
	act.click(clickbutton).perform();
	
	
	String Expectedtext = "Click Me";
	String Actualtext = clickbutton.getText();
	
	if(Expectedtext.equals(Actualtext))
	{
		System.out.println("Test Case is Validated");
	}
	else
	{
		System.out.println("Test Case is not Validated");
	}
	
	
	

	
	WebElement RightclickMe = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	act.contextClick(RightclickMe).perform();
	
	
	
	
	String Expectedtext1 = "Right Click Me";
	String Actualtext1 = RightclickMe.getText();
	
	if(Expectedtext1.equals(Actualtext1))
	{
		System.out.println("Test Case is Validated");
	}
	else
	{
		System.out.println("Test Case is not Validated");
	}
	
	
	
	
	WebElement DoubleclickMe = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	act.doubleClick(DoubleclickMe).perform();
	
	
	String Expectedtext2 = "Double Click Me";
	String Actualtext2 = DoubleclickMe .getText();
	
	if(Expectedtext2.equals(Actualtext2))
	{
		System.out.println("Test Case is Validated");
	}
	else
	{
		System.out.println("Test Case is not Validated");
	}
	
}
}
