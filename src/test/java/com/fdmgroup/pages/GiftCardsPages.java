package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardsPages {
	
	public static WebElement giftCardPageLabel(WebDriver driver) {
		return driver.findElement(By.id("Cineplex-Gift-Cards"));
	}
	
public static WebElement sendGiftCard(WebDriver driver) {
		
		return driver.findElement(By.xpath("//a[contains(@data-name,'Send-an-E-Gift-Card')]"));
	}

}
