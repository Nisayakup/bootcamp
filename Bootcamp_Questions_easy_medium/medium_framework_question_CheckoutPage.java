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

public class medium_framework_question_CheckoutPage {
	
	
	
	//Step 1: Create the Page Object Model (POM) for the Checkout Page
	

	    WebDriver driver;

	    @FindBy(id = "productName")    WebElement productName;

	    @FindBy(id = "productPrice")    WebElement productPrice;

	    @FindBy(id = "checkoutButton")    WebElement checkoutButton;

	    @FindBy(id = "confirmPurchase")    WebElement confirmPurchaseButton;

	    public void CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public String getProductName() {     return productName.getText();   }

	    public String getProductPrice() {      return productPrice.getText();   }

	    public void proceedToCheckout() {     checkoutButton.click();   }

	    public void confirmPurchase() {    confirmPurchaseButton.click();   }
	}
	//Step 2: Create the Page Object Model (POM) for the Product Page

	public class ProductPage {

	    WebDriver driver;
	    @FindBy(id = "addToCartButton")    WebElement addToCartButton;

	    @FindBy(id = "cartLink")    WebElement cartLink;

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	      public void addToCart() {      addToCartButton.click();   }

	      public void navigateToCart() {       cartLink.click();    }
	}
	//Step 3: Create a TestNG Test to Verify the Checkout Process
	public class CheckoutTest {

	    WebDriver driver;
	    ProductPage productPage;
	    CheckoutTest checkoutPage;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.example.com/product");
	        productPage = new ProductPage(driver);
	        checkoutPage = new CheckoutTest();
	    }

	    @Test
	    public void testProductPurchase() {
	        productPage.addToCart();
	        productPage.navigateToCart();
	        checkoutPage.proceedToCheckout();

	        String expectedProductName = "Example Product"; 
	        String expectedProductPrice = "$99.99"; 

	        Assert.assertEquals(checkoutPage.getProductName(), expectedProductName, "Incorrect product name!");
	        Assert.assertEquals(checkoutPage.getProductName(), expectedProductPrice, "Incorrect product price!");

	          checkoutPage.confirmPurchase();
	    }

	    private void confirmPurchase() {
			// TODO Auto-generated method stub
			
		}

		private Object getProductName() {
			// TODO Auto-generated method stub
			return null;
		}

		private void proceedToCheckout() {
			// TODO Auto-generated method stub
			
		}

		@AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}



