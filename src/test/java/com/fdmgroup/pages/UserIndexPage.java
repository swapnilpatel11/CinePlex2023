package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserIndexPage {
	public static WebElement accountUserButton(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Account']"));
	}
	
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//h3[contains(@data-name,'profile-name')]"));
	}
	
	
}
