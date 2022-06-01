package XpathLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions act = new Actions(driver);
	
	act.sendKeys("A").perform();
	
	WebElement enter = driver.findElement(By.xpath("/html/body/div[2]/div/div/p[2]"));
	
	String expectedresult = "You entred: A";
	String Actualresult = enter.getText();
	
	System.out.println(Actualresult);
	
	if(expectedresult.equals(Actualresult))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	
	}

}
