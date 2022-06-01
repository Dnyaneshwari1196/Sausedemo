package SosDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartButtonPomClass
{
     private WebDriver driver;
     
     
     // ContinueShopping
     @FindBy(xpath="//button[@id='continue-shopping']")
     private WebElement ContinueShopping;
     
     public void ContinueShopping()
     {
    	 ContinueShopping.click();
     }
    		 
     
     
     // Remove
     @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
     private WebElement Remove;
     
     public void Remove()
     {
    	 Remove.click();
     }
     
     
     
     // CheckOut
     
     @FindBy(xpath="//button[text()='Checkout']")
     private WebElement CheckOut;
     
     public void CheckOut()
     {
    	 CheckOut.click();
     }
     
     
     
     public AddToCartButtonPomClass(WebDriver driver)
     {
    	 this.driver = driver;
    	 
    	 PageFactory.initElements(driver, this);
     }
     
     
}
