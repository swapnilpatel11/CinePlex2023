package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement accountButton(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Account']"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("login"));
	}
	
	public static WebElement searchButton(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Search']"));
	}
	
	public static WebElement menuButton(WebDriver driver) {
		return driver.findElement(By.id("hamburger-button"));
	}
	
	public static WebElement giftCardButton(WebDriver driver) {
		return driver.findElement(By.id("gift-cards"));
	}
	
	public static WebElement footerDigitalMediaLink(WebDriver driver){
		return driver.findElement(By.id("cineplex-digital-media-sub-footer"));
	}
	
	public static WebElement foodAndDrinkButton(WebDriver driver) {
		return driver.findElement(By.id("food-&-drink"));
	}
	
	

}
