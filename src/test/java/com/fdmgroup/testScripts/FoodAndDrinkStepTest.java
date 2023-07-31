package com.fdmgroup.testScripts;

import org.openqa.selenium.WebDriver;
import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.FoodAndDrinkPage;
import com.fdmgroup.pages.FoodOrderPage;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.foodMenuPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class FoodAndDrinkStepTest {
	DriverUtilities driverUtilities = DriverUtilities.getInstance();
	WebDriver driver = driverUtilities.getDriver();
	
	@Given("User click on food & drink button")
	public void user_click_on_food_drink_button() {
	    HomePage.foodAndDrinkButton(driver).click();
	}

	@Given("User reach to food & drink page")
	public void user_reach_to_food_drink_page() {
	  assertEquals(DataFile.foodAndDrinkLable,FoodAndDrinkPage.foodAndDrinkLabel(driver).getText());
	}

	@Given("User click on order now button")
	public void user_click_on_order_now_button() {
	   FoodAndDrinkPage.orderNowButton(driver).click();
	}

	@Given("User reach on order now page")
	public void user_reach_on_order_now_page() {
	    assertEquals(DataFile.orderNowPageLable,FoodOrderPage.foodOrderLable(driver).getText());
	}

	@When("User select mobile pick up location from dropdown")
	public void user_select_mobile_pick_up_location_from_dropdown() {
		
		FoodOrderPage.selectTheatreDropdown(driver).click();
		FoodOrderPage.selectValueDropdown(driver).click();
//		WebElement StaticDropdown = FoodOrderPage.selectTheatreDropdown(driver);
//		
//		Select dropdown = new Select(StaticDropdown);
//		dropdown.selectByIndex(0);
	}

	@When("User click on view menu")
	public void user_click_on_view_menu() {
	    FoodOrderPage.viewMenuButton(driver).click();
	}

	@When("User reach on food menu page")
	public void user_reach_on_food_menu_page() {
	   assertEquals(DataFile.foodMenuLable,foodMenuPage.foodMenuLable(driver).getText());
	}

	@When("User click on combo three")
	public void user_click_on_combo_three() {
	    foodMenuPage.comboThree(driver).click();
	}

	@Then("User should be able see Combo Name, Price,Items, Calories and Serves")
	public void user_should_be_able_see_combo_name_price_items_calories_and_serves() {
	   assertEquals(DataFile.comboName,foodMenuPage.comboName(driver).getText());
	   
	   assertEquals(DataFile.comboItem,foodMenuPage.combeItems(driver).getText());
	   
	   assertEquals(DataFile.comboPrice,foodMenuPage.comboPrice(driver).getText());
	   
	   assertEquals(DataFile.calories,foodMenuPage.caloriesCount(driver).getText());
	   
	   assertEquals(DataFile.serves,foodMenuPage.servesCount(driver).getText());
	}


}
