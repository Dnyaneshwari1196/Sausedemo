package SosDemo.PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Assignment.Ass_swaglab2_Addtocart;

public class HomePagePomClass 
{
	private WebDriver driver;
	private Select s ;
     
     // single product
     @FindBy(xpath="//div[text()='Sauce Labs Backpack']")
 	private WebElement SingleProducts;
 		
 	public void addSingleProduct()
 	{
 		SingleProducts.click();
 	}
 	
 	
 	
 	
 	// single product add
 	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
 	private WebElement SingleProductClick;
 	
 	public void clicksingleproduct()
 	{
 		SingleProductClick.click();
 	}
     
     
     
     
     // 1 multiple add to cart
     @FindBy(xpath="//button[text()='Add to cart']")
     private List<WebElement> MultipleAddtocart;
    
     public void AddAllProduct()
     {
    	for(int i=0 ; i<MultipleAddtocart.size() ; i++)
    	{
    		MultipleAddtocart.get(i).click();
    	}
     }
     
     
     //2 filter
     @FindBy(xpath="//select[@class='product_sort_container']")
      private WebElement Filter;
     
  //   private  Select s ;
     
     public void applyFilter()
     {
    	 Filter.click();
    	 s.selectByVisibleText("Name(Z to A)");
     }
     
      
     //3 add to cart button
     @FindBy(xpath="//div[@id='shopping_cart_container']")
     private WebElement addtocart;
     
     public void clickaddtocart()
     {
    	 addtocart.click();
     }
    
     
     
     
      //4 add to hamberger
 	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
 	private WebElement menuButton;
 	
 	public void clickMenuButton()
 	{
 		menuButton.click();
 	}
 	
 	
 	
 	//all item
 	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
 	private WebElement AllItem;
 	
 	public void AllItem()
 	{
 		AllItem.click();
 	}
 	
 	
 	
 	//about button
 	@FindBy(xpath="//a[@id='about_sidebar_link']")
 	private WebElement Aboutbutt;
 	
 	public void Aboutbutt()
 	{
 		Aboutbutt.click();
 	}
 	
 	
 	
 	
 	// log out button
 	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	
	public void clickLogOutButton()
	{
		logOutButton.click();
	}

	
	
	
	//reset app state
	@FindBy(xpath="//a[@id='reset_sidebar_link']")
	private WebElement ResetAppState;
	
	public void ResetAppState()
	{
		ResetAppState.click();
	}
	
	
	
	//constuctor
	public HomePagePomClass(WebDriver driver)
	{
		this.driver = driver;
	
	PageFactory.initElements(driver,this);
	
 	s =  new Select(Filter);
 	
 	
	}
	

}
