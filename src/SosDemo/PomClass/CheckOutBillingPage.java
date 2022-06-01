package SosDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutBillingPage 
{
       private WebDriver driver;
     
       
     //Cancel Button
   	
   	@FindBy(xpath="//button[@id='cancel']")
   	private WebElement CancelButton;
   	
   	public void clickButton()
   	{
   		CancelButton.click();
   	}
   	
   	
   	
   	//Finish Button
   	
   	@FindBy(xpath="//button[@id='finish']")
   	private WebElement finishButton;
   	
   	public void clickFinishButton()
   	{
   		finishButton.click();
   	}
   	
   	
   	
   	public CheckOutBillingPage(WebDriver driver)
   	{
   		this.driver = driver;
   		
   		PageFactory.initElements(driver, this);
   	}
       
}
