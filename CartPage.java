package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LocatorUtils;

public class CartPage {
		
	    public static String CartButton = "#nav-cart";
	    public static String CartElement ="/html/body/div[1]/div[2]/div[3]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li[1]/span/a/span[1]";
	    //public static String CartElement = "//li/span/a/span";
	    public static String ExpectedTitle = "Treasure Island by Robert Louis Stevenson";
	    
	    // Link to Cart Button
	    public static WebElement CartButton(WebDriver driver){
	 	   return LocatorUtils.findElement(driver, "css", CartButton); 
	    }

	 // Link to the Submit Button
	    public static WebElement CartElement (WebDriver driver){
	 	 	 return LocatorUtils.findElement(driver, "xpath", CartElement);  
	 	}
	
}