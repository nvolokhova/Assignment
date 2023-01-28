package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LocatorUtils;

public class ResultsPage {
	
    private static String LinkSearchResult = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[12]/div/div/div/div/div[2]/div[1]/h2/a";
    private static String AddToCartButton = "#add-to-cart-button";
    
    
    // Choose the book
    public static WebElement LinkSearchResult(WebDriver driver){
 	   return LocatorUtils.findElement(driver, "xpath", LinkSearchResult); 
    }

    // Add to cart
    public static WebElement AddToCartButton(WebDriver driver){
    	return LocatorUtils.findElement(driver, "css", AddToCartButton);
    }

    
}