package XpathLocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChildwindowPopup 
{
 public static void main(String[] args)
 {
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 System.out.println("open chrome browser");
	 
	 driver.manage().window().maximize();
	 System.out.println("maximize the window");
	 
	 driver.get("https://vctcpune.com/");
	 System.out.println("open url or main page");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 System.out.println("put wait");
	 
	 // get the adreess of main page
	 String MainPageAdress = driver.getWindowHandle();
	 
	 System.out.println("get the adress of main page");
	 System.out.println("main page- "+MainPageAdress);
	
	 WebElement startselenium = driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-686']"));
	 startselenium.click();
	 
	 System.out.println("start the selenium practice page");
	
	 // get the adress of both main and child page
	 List <String> AllPageAdress = new ArrayList <String> (driver.getWindowHandles());
	 
	 System.out.println(AllPageAdress);
	 System.out.println("get the adress of both pages");
	
	 driver.switchTo().window(AllPageAdress.get(1));
	 System.out.println("move to the childpopup page");
	
	 WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	 System.out.println("move to the textbox");
	 
	 textbox.sendKeys("India");
	 System.out.println("type the text - India");
	
	
}
}
