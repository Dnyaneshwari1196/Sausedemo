package XpathLocators;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Mouse_Scrolling 
{
	static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile   = new File("E:\\Automation Screenshot\\.SS\"+date+\"jpg");
		FileHandler.copy(SourceFile, destFile);
		}
	
	
      public static void main(String[] args) throws InterruptedException, IOException 
  {
   	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
  
    driver.get("https://vctcpune.com/selenium/practice.html");
    driver.manage().window().maximize();
  
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  
    JavascriptExecutor js = (JavascriptExecutor)driver;
  
    js.executeScript("window.scrollBy(0,1200)");
  
    Thread.sleep(2000);
  
    js.executeScript("window.scrollBy(0,-1000)");
      
    Thread.sleep(2000);
    

    String  ExpectedResult = "Practice Page";
    
    String  AcutalResult = driver.getTitle();
    
    if(ExpectedResult.equals(AcutalResult))
  {
	  System.out.println("title get success");
  }
    else
  {
	  System.out.println("fail");
  }
  
  
  
  }
}
