package XpathLocators;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup 
{
//    static WebDriver driver;
//    
//    public static void screenshot()
//    {
//    	Date d = new Date();
//    	DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
//    	String date = d1.format(d);
//    	
//    	
//    }
    
    public static void main(String[] args)
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		
    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	//	String url = "the-internet.herokuapp.com/basic_auth";
//		
//		String username = "admin";
//		String password = "admin";
//		
//		String mainUrl ="https://"+username+":"+password+"@"+url;
//		
//		driver.get(mainUrl);
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
}       
