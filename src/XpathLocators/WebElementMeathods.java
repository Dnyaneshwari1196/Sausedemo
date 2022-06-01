package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMeathods
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://portal.aws.amazon.com/billing/signup?nc2=h_ct&src=header_signup&refid=14a4002d-4936-4343-8211-b5a150ca592b&redirect_url=https%3A%2F%2Faws.amazon.com%2Fregistration-confirmation#/start/email");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='awsui-input-0']"));
	email.clear();
	email.sendKeys("dnyaneshwaridhepe01@gmail.com");
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("//input[@id='awsui-input-1']"));
	username.clear();
	username.sendKeys("dnyaneshwari123");
	Thread.sleep(2000);
	
	
	String idAttribute = username.getAttribute("id");
	System.out.println(idAttribute);
	
	
	String text = username.getText();
	System.out.println(text);
	
	
	String tagname = username.getTagName();
	System.out.println(tagname);
	
	
	
	WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Verify email address')]"));
	login.click();
	
	
	}
}
