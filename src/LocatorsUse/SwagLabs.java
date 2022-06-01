package LocatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		//url
		driver.get(" https://www.saucedemo.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		// Locator-id
//		//user name
//		WebElement UserName = driver.findElement(By.id("user-name"));
//		UserName.sendKeys("problem_user");
//		Thread.sleep(2000);
//		
//		//passward
//		WebElement Passward = driver.findElement(By.id("password"));
//		Passward.sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		
//		//login
//		
//		WebElement Login = driver.findElement(By.id("login-button"));
//		Login.click();
//		
//		
//		 String ActualURL = "https://www.saucedemo.com/inventory.html";
//			String ExpectedURL = driver.getCurrentUrl();
//			
//			if(ActualURL.equals(ExpectedURL))
//			{
//			   System.out.println("login is successful");
//			}
//			else
//			{
//				System.out.println("login is fail");
//			}
//			
//			String Actualtitle = "SwagLabs";
//			String Expectedtitle = driver.getTitle();
//			
//			if(Actualtitle.equals(Expectedtitle))
//			{
//				System.out.println("passed");
//			}
//			else
//			{
//				System.out.println("fail");
//			}
//			
			
			
//			//Locator-name
//			
//			WebElement username = driver.findElement(By.name("user-name"));
//			username.sendKeys("problem_user");
//			Thread.sleep(2000);
//			
//			WebElement password = driver.findElement(By.name("password"));
//			password.sendKeys(""secret_sauce";
//			Thread.sleep(2000);
//			
//			WebElement login = driver.findElement(By.name("login-button"));
//			login.click();
//			
			
			
			//Locator-classname
			
			WebElement username = driver.findElement(By.tagName("input"));
			username.sendKeys("problem_user");
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.tagName("input"));
			password.sendKeys("secret_sauce");
			Thread.sleep(2000);
			
			WebElement login = driver.findElement(By.tagName("input"));
			login.click();
			
			
			
	}
}

