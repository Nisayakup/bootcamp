package Bootcamp_Questions_easy_medium;


	
	
	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Easy_framework_question_2_LoginWithValidCredentials {
		public WebDriver driver;
		
		
		@BeforeMethod
		public void setup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}
		
		@Test(priority = 1)
		public void validCredentials() {
			driver.findElement(By.id("input-email")).sendKeys("guharnisa11@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Diyarim22107");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
			
		}
		

}
