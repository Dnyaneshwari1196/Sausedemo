package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe2 
{
public static void main(String[] args) throws InterruptedException
{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
	
	System.out.println("Browser open");
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	System.out.println("URL open");
	
	driver.manage().window().maximize();
	System.out.println("maximize the window");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	System.out.println("implisitly wait apply");
	
	WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(Frame1);
	
	System.out.println("focus switch to iframe");
	
	WebElement topic = driver.findElement(By.xpath("/html/body/input"));
	topic.sendKeys("mayu");
	System.out.println("send the key");
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@id='frame3']"));
	driver.switchTo().frame(innerframe);
	
	System.out.println("focus switch to innerframe");
	
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
	checkbox.click();
	System.out.println("click on the checkbox");
	
	driver.switchTo().defaultContent();
	System.out.println("switch to grandparent");
	
	WebElement UIfocus = driver.findElement(By.xpath("(//a[@class='nav-link head'])[3]"));
	UIfocus.click();
	System.out.println("open UI");
	
	
	

//    driver.switchTo().parentFrame();
//    Thread.sleep(2000);
//    
//    topic.clear();
//    Thread.sleep(2000);
//    topic.sendKeys("Aishu");
    
    
    
    
    
    
    
    
    
    
    
//    WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
//    driver.switchTo().frame(Frame2);
//     
//    WebElement dropdown = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
//    dropdown.click();
//    
//    Select s = new Select(dropdown);
//    s.deselectByVisibleText("Big Baby Cat");


}
}
