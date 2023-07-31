package com.fdmgroup.testScripts;

import java.time.Duration;
import static org.junit.Assert.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.pages.SearchResultPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepTest {
	private DriverUtilities driverUtilities = DriverUtilities.getInstance();
	private WebDriver driver = driverUtilities.getDriver();
	
	@Given("User should launch application")
	public void user_should_launch_application() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	    driver.get(DataFile.homeURL);
	}

	@When("User enter movie name and click enter")
	public void user_enter_movie_name_and_click_enter() {
	    HomePage.searchButton(driver).click();
	    SearchPage.searchTextBox(driver).sendKeys(DataFile.movieName + Keys.ENTER);
	}

	@Then("User should get result according to data enter")
	public void user_should_get_result_according_to_data_enter() {
	    assertEquals(DataFile.resultPageLable,SearchResultPage.resultPage(driver).getText());
	    
	}

	@When("User click on first result of movie show times")
	public void user_click_on_first_result_of_movie_show_times() {
	    SearchResultPage.findShowTimeButton(driver).click();
	}

	@Then("User should be able to see Genre")
	public void user_should_be_able_to_see_genre() {
	    assertEquals(DataFile.searchGenreName,SearchResultPage.genreName(driver).getText());
	}
}
