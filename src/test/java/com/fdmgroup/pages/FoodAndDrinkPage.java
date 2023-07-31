package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodAndDrinkPage {
	
	public static WebElement foodAndDrinkLabel(WebDriver driver) {
		return driver.findElement(By.xpath("//h1[text()='Food And Drinks']"));
	}
	
	public static WebElement orderNowButton(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Order Now']"));
	}

}
