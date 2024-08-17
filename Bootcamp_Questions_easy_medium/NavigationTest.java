package Bootcamp_Questions_easy_medium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationTest {
	
    private WebDriver driver;
    private final String baseUrl = "https://www.example.com"; 
    private final String linkText = "More information..."; 

    private final String expectedElementId = "someElementId"; 
    private final String expectedElementText = "Expected Text"; 

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        driver = new ChromeDriver();
         driver.manage().window().maximize();
    }

    @Test
    public void testNavigationAndElementVerification() {

         driver.get(baseUrl);

       WebElement link = driver.findElement(By.linkText(linkText)); 
        link.click();

        WebElement expectedElement = driver.findElement(By.id(expectedElementId)); 

        String actualText = expectedElement.getText();
        Assert.assertEquals(actualText, expectedElementText, "The element text does not match the expected text!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser and quit the driver
        if (driver != null) {
            driver.quit();
        }
    }
}



