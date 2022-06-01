package SosDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_CostumerInfoPomClass
{
        private WebDriver driver;
        
        
        // FirstClass
        @FindBy(xpath="//input[@id='first-name']")
        private WebElement FirstClass;
        
        public void FirstClass()
        {
        	FirstClass.sendKeys("Mayuri");
        }
        
        
        
        // Lastname
        @FindBy(xpath="//input[@id='last-name']")
        private WebElement Lastname;
        
        public void Lastname()
        {
        	Lastname.sendKeys("Reche");
        }
        
        
        
        
        // Pincode
        @FindBy(xpath="//input[@id='postal-code']")
        private WebElement Pincode;
        
        public void Pincode()
        {
        	Pincode.sendKeys("444705");
        }
        
        
        
        
        
        
        // Cancel
        @FindBy(xpath="//button[@id='cancel']")
        private WebElement Cancel;
        
        public void Cancel()
        {
        	Cancel.click();
        }
        
        
        
        
         
        // Continue
        @FindBy(xpath="//input[@id='continue']")
        private WebElement Continue;
        
        public void Continue()
        {
        	Continue.click();
        }
        
        
        
        
        
        public CheckOut_CostumerInfoPomClass(WebDriver driver)
        {
        	this.driver = driver;
        	PageFactory.initElements(driver, this);
        }
        
        
}
