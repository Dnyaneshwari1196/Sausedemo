package XpathLocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable 
{
  public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	   System.out.println("open chrome browser");
		 
	   driver.manage().window().maximize();
	   System.out.println("maximize the window");
		 
	   driver.get("https://vctcpune.com/");
	   System.out.println("open URL");
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   System.out.println("put wait");
	   
	   //get the main page adress
	   String mainpageadress = driver.getWindowHandle();
	   
	   System.out.println("main page adress");
	   System.out.println("main page -"+ mainpageadress);
	   
	   WebElement startselenium = driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-686']"));
	   startselenium.click();
	   
	   System.out.println("start the selenium page");
	   
	   //get the both page adress
	   List<String> bothpageadress = new ArrayList<String> (driver.getWindowHandles());
	   
	   System.out.println("both page adress");
	   System.out.println(bothpageadress);
	   
	   driver.switchTo().window(bothpageadress.get(1));
	   System.out.println("move to the child page");
	   
   	  List<WebElement> header = driver.findElements(By.xpath("/html/body/section[3]/div/div/div[1]/table/tbody/tr[1]/th"));
	  
   	  System.out.println("header elements are");
   	  
   	  for(int i=0 ; i<header.size() ; i++)
   	  {
   		  System.out.println(header.get(i).getText());
   	  }
   	  
   	  List<WebElement> cell = driver.findElements(By.xpath("/html/body/section[3]/div/div/div[1]/table/tbody/tr/td"));
   	  
   	  System.out.println("cell elements are");
   	  
   	  for(int i=0 ; i<cell.size() ; i++)
   	  {
   		  System.out.println(cell.get(i).getText());
   	  }
   	
   	
   	
   	
   	
   	
   	
}
}
