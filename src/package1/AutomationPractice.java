package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.facebook.com/");
			Thread.sleep(2000);
			
			
			driver.navigate().to( "https://www.instagram.com/");
			Thread.sleep(2000);
			
//			driver.navigate().back();        //facebook
//			Thread.sleep(2000);
//			
//			driver.navigate().forward();     //instagram
//			Thread.sleep(2000);
//			
//			driver.navigate().refresh();
//			Thread.sleep(2000);
//			
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			
//			driver.manage().window().minimize();
//			Thread.sleep(2000);
//		
			
//			driver.close();
//		Thread.sleep(2000);
//			
//		    driver.quit();
//			Thread.sleep(2000);
//			
			//set size
			Dimension d = new Dimension(300,500);
			driver.manage().window().setSize(d);
			Thread.sleep(3000);
			
			//set position
			Point p = new Point(800,200);
			driver.manage().window().setPosition(p);
			
	}
	
	
	
	
	
}
