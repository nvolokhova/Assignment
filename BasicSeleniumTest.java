package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.Constant;
import utility.ExcelUtils;

public class BasicSeleniumTest {
	
	public static WebDriver driver;
	
	@DataProvider(name = "Amazon")
	public static Object[][] credentials() throws Exception {

	    Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_TestData+Constant.File_TestData,Constant.Sheet_Name);
	    
	    return (testObjArray);
	}

	@BeforeMethod
	@Parameters ({"browser"})
	public void beforeMethod(String browser) {
		switch(browser) {
		case "chrome":
		// Create a new instance of Chrome driver
		driver = new ChromeDriver();
		Reporter.log("Create a new instance of Chrome driver");
		break;
		case "firefox":
		// Create a new instance of Firefox driver
		driver = new FirefoxDriver();
		Reporter.log("Create a new instance of Firefox driver");
		break;
		case "edge":
		// Create a new instance of Edge driver
		driver = new EdgeDriver();
		Reporter.log("Create a new instance of Edge driver");
		break;
		}
		// We are waiting for the page to load for up to 5 seconds and then throw an exception
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Launch the Website
	    try {
		driver.navigate().to(Constant.URL);
			Reporter.log("Launch of " + Constant.URL + " website - PASS");
	    } catch (org.openqa.selenium.TimeoutException e) {
	    	Reporter.log("Launch of " + Constant.URL + " website took longer than 5 seconds - FAIL");
	    }
	    
		Reporter.log("Launch " + Constant.URL + " website");

	}

	@AfterMethod
	public void afterMethod() {
		  driver.close();
	}
}