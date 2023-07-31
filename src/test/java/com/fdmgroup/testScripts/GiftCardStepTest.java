package com.fdmgroup.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.GiftCardsPages;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.SendGiftCardPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardStepTest {
	private DriverUtilities driverUtilities = DriverUtilities.getInstance();
	private WebDriver driver = driverUtilities.getDriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@Given("User click on Menu")
	public void user_click_on_menu() {
	    HomePage.menuButton(driver).click();
	}

	@Given("User click on Gift Cards")
	public void user_click_on_gift_cards() {
	    HomePage.giftCardButton(driver).click();
	}

	@Given("User reach on Gift cards page")
	public void user_reach_on_gift_cards_page() {
	   assertEquals(DataFile.giftCardPageLabel, GiftCardsPages.giftCardPageLabel(driver).getText());
	}

	@Given("User click on Send an E-Gift Card button")
	public void user_click_on_send_an_e_gift_card_button() {
		
		jse.executeScript("window.scrollBy(0,500)");
	    GiftCardsPages.sendGiftCard(driver).click();
	}

	@When("User enter all Value , Qauntity,Message, Recipient Name,Email on page")
	public void user_enter_all_value_qauntity_message_recipient_name_email_on_page() {
		assertEquals(DataFile.sendGiftCardPageLabel,SendGiftCardPage.cineplexEgiftCardLabel(driver).getText());
		
		//jse.executeScript("window.scrollBy(0,200)");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@title,'Buy')]")));
		
		//jse.executeScript("window.scrollBy(0,200)");
		//SendGiftCardPage.selectValuePrice(driver).click();
		//SendGiftCardPage.cardQuantity(driver).click();
		//SendGiftCardPage.cardQuantity(driver).sendKeys(Keys.CLEAR + DataFile.quantity);
		
		SendGiftCardPage.cardMessage(driver).sendKeys(DataFile.giftMessage);
		
		//jse.executeScript("window.scrollBy(0,200)");
		
		SendGiftCardPage.recipientName(driver).sendKeys(DataFile.recipientName);
		
		SendGiftCardPage.recipientEmail(driver).sendKeys(DataFile.email);
		
		SendGiftCardPage.senderName(driver).sendKeys(DataFile.recipientName);
		
		
	}

	@When("User click on Add to Cart button")
	public void user_click_on_add_to_cart_button() {
	    SendGiftCardPage.addToCart(driver).click();
	   
	}

	@Then("User should able to see total amount of gift card")
	public void user_should_able_to_see_total_amount_of_gift_card() {
	   assertEquals(DataFile.totalAmount,SendGiftCardPage.totalPrice(driver).getText());
		//System.out.println(SendGiftCardPage.totalPrice(driver).getText());
		 driver.switchTo().defaultContent();	
	}

}
