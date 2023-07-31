package com.fdmgroup.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepTest {
	private DriverUtilities driverUtilities = DriverUtilities.getInstance();
	private WebDriver driver = driverUtilities.getDriver();

	@Given("User click on Account button")
	public void user_click_on_account_button() {
	    HomePage.accountButton(driver).click();
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
	    HomePage.loginButton(driver).click();
	}

	@When("User enter invalid email and password")
	public void user_enter_invalid_email_and_password() {
		//Handle iFrame
//		driver.switchTo().frame(driver.findElement(By.id("frameId")));
//		//do your stuff
//		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("bootstrapModalIframe")));
		LoginPage.emailField(driver).sendKeys(DataFile.email);
		LoginPage.passwordField(driver).sendKeys(DataFile.password);
		LoginPage.logInButton(driver).click();
		
	}

	@Then("User should not able to login into account")
	public void user_should_not_able_to_login_into_account() {
	    assertTrue(LoginPage.logInButton(driver).isDisplayed());
	    //LoginPage.closeButton(driver).click();
	    driver.switchTo().defaultContent();	    
	}


}
