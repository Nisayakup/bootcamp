package Bootcamp_Questions_easy_medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v122.serviceworker.model.RegistrationID;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MediuM_framework_question_1 {

	//Step 1: Create the Page Object Model (POM) for the Registration Page


	    WebDriver driver;

	    @FindBy(id = "firstName")     WebElement firstNameField;

	    @FindBy(id = "lastName")    WebElement lastNameField;

	    @FindBy(id = "email")    WebElement emailField;

	    @FindBy(id = "password")    WebElement passwordField;

	    @FindBy(id = "confirmPassword")    WebElement confirmPasswordField;

	    @FindBy(id = "registerButton")    WebElement registerButton;

	    @FindBy(xpath = "//div[@class='success-message']")    WebElement successMessage;

	    public void RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void fillRegistrationForm(String firstName, String lastName, String email, String password, String confirmPassword) {
	        firstNameField.sendKeys(firstName);
	        lastNameField.sendKeys(lastName);
	        emailField.sendKeys(email);
	        passwordField.sendKeys(password);
	        confirmPasswordField.sendKeys(confirmPassword);
	    }

	     public void submitRegistrationForm() {    registerButton.click();     }

	     public boolean isRegistrationSuccessful() {   return successMessage.isDisplayed();  }
	}





