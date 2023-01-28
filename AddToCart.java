package tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModule.AddToCartAction;
import core.BasicSeleniumTest;
import pageObjects.CartPage;

public class AddToCart extends BasicSeleniumTest{

// Here we are calling the Data Provider object with its Name
@Test(dataProvider = "Amazon")
public void testAddToCart(String sNovel, String sAuthor) throws Exception {

DOMConfigurator.configure("log4j.xml");

// Add the book to the cart
AddToCartAction.Execute(driver, sNovel, sAuthor);
	

// Validate the title of the book
Assert.assertTrue(CartPage.CartElement(driver).getText().contains(CartPage.ExpectedTitle));
Reporter.log("Step 7 - Title validation - PASSED");

}

}