package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LocatorUtils;

public class HomePage {
		
	    public static String TextSearch = "#twotabsearchtextbox";
	    public static String SubmitButton = "#nav-search-submit-button";
	    	    
	    // Link to Search Bar
	    public static WebElement TextSearch(WebDriver driver){
	 	   return LocatorUtils.findElement(driver, "css", TextSearch); 
	    }

	 // Link to the Submit Button
	    public static WebElement SubmitButton (WebDriver driver){
	 	 	 return LocatorUtils.findElement(driver, "css", SubmitButton);  
	 	}
	
}