package appModule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ResultsPage;

public class AddToCartAction {
	
	public static String Execute(WebDriver driver, String sNovel, String sAuthor) throws Exception{
		
		// Click Search Bar
		HomePage.TextSearch(driver).click();
		Reporter.log("Step 1 - Click Search Bar - PASSED");
		
		// Enter the name of the book
		HomePage.TextSearch(driver).sendKeys(sNovel + " " + sAuthor);
		Reporter.log("Step 2 - Enter the name of the book - PASSED");

		// Click Submit button
		HomePage.SubmitButton(driver).click();
		Reporter.log("Step 3 - Click Submit button - PASSED");
		
		//Choose the book
		ResultsPage.LinkSearchResult(driver).click();
		Reporter.log("Step 4 - Choose the book on the results page - PASSED");
		
		
		//Add to Cart
		ResultsPage.AddToCartButton(driver).click();
		Reporter.log("Step 5 - Add the book to the cart - PASSED");
		
		//Go to the cart
		CartPage.CartButton(driver).click();
		Reporter.log("Step 6 - Go to the cart - PASSED");
		
		//Get the title of the Item
		return CartPage.CartElement(driver).getText();
		
		
			

	}
}
