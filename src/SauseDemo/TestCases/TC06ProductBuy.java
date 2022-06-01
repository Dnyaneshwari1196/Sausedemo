package SauseDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SosDemo.PomClass.AddToCartButtonPomClass;
import SosDemo.PomClass.CheckOutBillingPage;
import SosDemo.PomClass.CheckOut_CostumerInfoPomClass;
import SosDemo.PomClass.HomePagePomClass;
import SosDemo.PomClass.LoginPgePomClass;
import SosDemo.PomClass.OrderPagePomClass;

public class TC06ProductBuy extends TestBaseClass
{
   
      @Test
    public void productadd()
	{
		
	    
	    
	    //object of home page
	    
	    HomePagePomClass hp = new HomePagePomClass (driver);
	    
	    hp.addSingleProduct();
	    System.out.println("click");
	    
	    System.out.println("product selected");
	    
	    
	    hp.clicksingleproduct();
	    System.out.println("click");
	    
	    System.out.println("product add");
	    
	   
	    hp.clickaddtocart();
	    System.out.println("click on card button");
	    
	    
	    
	    //object of add to card button
	    AddToCartButtonPomClass ac = new AddToCartButtonPomClass(driver);
	    
	    ac.CheckOut();
	    System.out.println("click on checkout");
	    
	    
	    
	    //object of checkout
	    CheckOut_CostumerInfoPomClass co = new CheckOut_CostumerInfoPomClass(driver);
	    
	    co.FirstClass();
	    System.out.println("enterd first name");
	    
	    co.Lastname();
	    System.out.println("enterd last name");
	    
	    co.Pincode();
	    System.out.println("enterd pincode");
	    
	    co.Continue();
	    System.out.println("click on continue");
	    
	    
	    
	    //object of billing page
	    CheckOutBillingPage bp = new CheckOutBillingPage(driver);
	    
	    bp.clickFinishButton();
	    System.out.println("click on finish button");
	    
	   
	    
	    //object of oder page
	    OrderPagePomClass op = new OrderPagePomClass(driver);
	    
	    op.clickBackHomeButton();
	    System.out.println("click on back to home");
	    
	    
}
}
