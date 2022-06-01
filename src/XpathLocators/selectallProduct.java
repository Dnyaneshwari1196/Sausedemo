package XpathLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectallProduct 
{
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 System.out.println("open chrome browser");
	 
	 driver.manage().window().maximize();
	 System.out.println("maximize the window");
	 
	 driver.get("https://www.saucedemo.com/");
	 System.out.println("open the website");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	WebElement username =  driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
	username.sendKeys("standard_user");
	
	WebElement password =  driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
	password.sendKeys("secret_sauce");
	
	WebElement loginbutt =  driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	loginbutt.click();
	
	System.out.println("login done");
	
	List <WebElement> allProducts = driver.findElements(By.xpath("//button[text()='Add to cart']"));
	
//    allProducts.get(0).click();
//    allProducts.get(1).click();
//    allProducts.get(2).click();
//    allProducts.get(3).click();
//    allProducts.get(4).click();
//    allProducts.get(5).click();
    
     for(int i=0 ; i<allProducts.size() ; i++)
     {
    	 allProducts.get(i).click();
     }
     System.out.println("multiple product added to cart");
     
     WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
     
     String expected = "6";
     String actual = cart.getText();
     
     if(expected.equals(actual))
     {
    	 System.out.println("all 6 product addes successfully");
     }
     else
     {
    	 System.out.println("test case isfail");
     }

    
	
}
}
