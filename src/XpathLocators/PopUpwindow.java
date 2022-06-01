package XpathLocators;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class PopUpwindow 
{
	static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\Automation Screenshot\\.SS\\"+date+"jpg");
		FileHandler.copy(SourceFile, destFile);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act = new Actions(driver);
		
//		WebElement clickmebutt = driver.findElement(By.xpath("//button[contains(@id,'alertButton')]"));
//		act.click(clickmebutt).perform();
//		
//		Thread.sleep(3000);
//		
		Alert alt = driver.switchTo().alert();
//		alt.accept();
		
//		Thread.sleep(3000);
		
//		WebElement confirmbutt = driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]"));
//		act.click(confirmbutt).perform();
//		
//		Thread.sleep(3000);
//		alt.accept();
//		
//		
		
//		WebElement secondbutt = driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]"));
//		
//		Thread.sleep(6000);
//		act.click(secondbutt).perform();
////		
//		Thread.sleep(5000);
//		alt.accept();
		
		
		WebElement promptbutt = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button"));
    	act.click(promptbutt).perform();
	
    	Thread.sleep(3000);
    	
    	Alert alt2 = driver.switchTo().alert();
    	
		alt2.sendKeys("mayu");
		
		Thread.sleep(2000);
		
		alt2.accept();
		
		
	}

}
