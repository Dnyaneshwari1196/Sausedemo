package LocatorsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrengeHrm {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver ();
	
	
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     
	//    WebElement username = driver.findElement(By.id("txtUsername"));
	//    username.sendKeys("admin");
	//    Thread.sleep(2000);
	    
	    
	//    WebElement password = driver.findElement(By.id("txtPassword"));
	//    password.sendKeys("admin123");
	//    Thread.sleep(2000);
	    
	    
	  //  WebElement login = driver.findElement(By.id("btnLogin"));
	  //  login.click();
	 //   Thread.sleep(2000);
	    
	  //  WebElement forgotpassword = driver.findElement(By.tagName("a"));
	//    forgotpassword.click();
	    
	     
	 //    WebElement link = driver.findElement(By.linkText("Forgot your password?"));
	  //   link.click();
	     
	   //  WebElement plink = driver.findElement(By.partialLinkText("Forgot"));
	  //   plink.click();
	     
	     
	     
	     
	     
	     WebElement attribute = driver.findElement(By.id("href"));
	     attribute.click();
	     
	     
	     
	     
	}

}
