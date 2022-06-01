package XpathLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement Seoul1 = driver.findElement(By.xpath("//div[@id = 'box5']"));
	
	WebElement SouthKorea = driver.findElement(By.xpath("//div[@id = 'box105']"));
	
	Actions act = new Actions(driver);
	
//	act.dragAndDrop(Seoul1, SouthKorea).perform();
	
	String Expected = "Seoul";
	String Actualresult = Seoul1.getText();
	
	if(Expected.equals(Actualresult))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	//or
	
	String ExpectedResult1 = "South Korea";	
	String ActualResult1 = SouthKorea.getText();
	
	if(ExpectedResult1.equals(ActualResult1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
