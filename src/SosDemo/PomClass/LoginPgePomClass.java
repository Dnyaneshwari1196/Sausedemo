package SosDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPgePomClass 
{
	private WebDriver driver;
	private Actions act;
    
    
    @FindBy(xpath="//input[@id='user-name']")
    private WebElement Username;
    
    public void sendUsername()
    {
    	Username.sendKeys("standard_user");
    }
    
    
    
    
    @FindBy(xpath="//input[@id='password']")
    private WebElement Password;
    
    public void sendPassword()
    {
    	Password.sendKeys("secret_sauce");
    }
    
    
    
    
    @FindBy(xpath="//input[@id='login-button']")
    private WebElement Loginbutt;
    
    public void clickLoginbutt()
    {
    	//Loginbutt.click();
    	act.click(Loginbutt).perform();
    }
    
    
    
	public LoginPgePomClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	

}
