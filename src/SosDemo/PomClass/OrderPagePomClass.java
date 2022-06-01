package SosDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPagePomClass 
{
       private WebDriver driver;
       
     //Back to Home
   	
   	@FindBy(xpath="//button[@id='back-to-products']")
   	private WebElement BackHomeButton;
   	
   	public void clickBackHomeButton()
   	{
   		BackHomeButton.click();
   	}
   	
   	
   	
   	public OrderPagePomClass (WebDriver driver)
   	{
   		this.driver = driver;
   		
   		PageFactory.initElements(driver, this);
   	}
}
