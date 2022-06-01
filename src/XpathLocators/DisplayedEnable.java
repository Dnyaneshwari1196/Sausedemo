package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnable
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
 
   //hide
   
//   WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//   hide.click();
//   
//   WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//   boolean result = textbox.isDisplayed();
//   
//   System.out.println(result);                  //false
//   
//   
//   WebElement show = driver.findElement(By.xpath("//input[@id='show-textbox']"));
//   show.click();
//   
//   boolean result1 = textbox.isDisplayed();
//   System.out.println(result1);                  //true  
//   
   
	
//	//enable
//   WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//   boolean result = textbox.isEnabled();
//   
//   System.out.println(result);
//   
//   if(result == true)
//   {
//	   System.out.println("india");
//   }
//   else
//   {
//	   System.out.println("we can not pass the value");
//   }
   
	
	
	
//	//selected
//	WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio'][2]"));
//	
//	boolean result = radiobutton.isSelected();
//	
//	System.out.println(result);
//	
//	if(result == false)
//	{
//		radiobutton.click();
//	}
//	else
//	{
//		System.out.println("the button is already click");
//	}
//	boolean result1 = radiobutton.isSelected();
//	
//		System.out.println("after clicking "+ result1);
	
	
	
//	//dropdown
//	
//	WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//	dropdown.click();
//	
//	Select s = new Select(dropdown);
//	//s.selectByIndex(1);
//    // s.selectByValue("option3");
//	s.selectByVisibleText("Option1");
//	
	
	
	//
	WebElement suggesion = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
	
   Point result =	suggesion.getLocation();
   System.out.println(result);
   
   int result1 = suggesion.getLocation().getX();
   System.out.println(result1);
   
   
     int result2 =  suggesion.getLocation().getY();
     System.out.println(result2);
     
     
     Dimension result3 = suggesion.getSize();
	System.out.println(result3);
	
	
	int result4 = suggesion.getSize().getHeight();
	System.out.println(result4);
	
	
	int result5 = suggesion.getSize().getWidth();
	System.out.println(result5);
	
	
}
}
