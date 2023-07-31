package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement searchTextBox(WebDriver driver) {
		return driver.findElement(By.id("search-drawer"));
	}
	
	

}
