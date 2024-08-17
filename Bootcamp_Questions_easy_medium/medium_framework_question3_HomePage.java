package Bootcamp_Questions_easy_medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class medium_framework_question3_HomePage {
	
	
	//Step 1: Create the Page Object Model (POM) for the Home Page

	public class HomePage {

	    WebDriver driver;

	    @FindBy(id = "logo")     WebElement logo;

	    @FindBy(id = "searchBox")    WebElement searchBox;

	    @FindBy(id = "searchButton")    WebElement searchButton;

	    @FindBy(id = "navigationLink")    WebElement navigationLink;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public boolean isLogoDisplayed() {
	        return logo.isDisplayed();
	    }

	     public boolean isSearchBoxDisplayed() {
	        return searchBox.isDisplayed();
	    }

	     public void enterSearchQuery(String query) {
	        searchBox.sendKeys(query);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }

	    // Method to click on the navigation link
	    public void clickNavigationLink() {
	        navigationLink.click();
	    }
	}
	//Step 2: Create a TestNG Test to Verify the Home Page

	public class HomePageTest {

	    WebDriver driver;
	    HomePage homePage;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        driver = new ChromeDriver();

	         driver.manage().window().maximize();

	        driver.get("https://www.example.com");

	        homePage = new HomePage(driver);
	    }

	    @Test
	    public void testHomePageElements() {
	        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed!");

	        Assert.assertTrue(homePage.isSearchBoxDisplayed(), "Search box is not displayed!");

	        homePage.enterSearchQuery("example search");
	        homePage.clickSearchButton();
	        
	        homePage.clickNavigationLink();
	        
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


}
