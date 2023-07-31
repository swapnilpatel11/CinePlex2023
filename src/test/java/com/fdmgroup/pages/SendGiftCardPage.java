package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendGiftCardPage {
	
	public static WebElement cineplexEgiftCardLabel(WebDriver driver) {
		return driver.findElement(By.id("Cineplex-E-Gift-Cards"));
	}
	
	public static WebElement selectValuePrice(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(@data-value,'100')]"));
	}
	
	public static WebElement cardQuantity(WebDriver driver) {
		return driver.findElement(By.id("card_quantity"));
	}
	
	public static WebElement cardMessage(WebDriver driver) {
		return driver.findElement(By.id("card_message"));
	}
	
	public static WebElement recipientName(WebDriver driver) {
		return driver.findElement(By.id("email_recipient_name"));
	}
	
	public static WebElement recipientEmail(WebDriver driver) {
		return driver.findElement(By.id("email_recipient_email"));
	}
	
	public static WebElement senderName(WebDriver driver) {
		return driver.findElement(By.id("email_from_name"));
	}
	
	public static WebElement addToCart(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@class='button add-to-cart no-tab']//span[contains(text(),'Add to cart')]"));
	}
	
	public static WebElement totalPrice(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='t-total']"));
	}
}
