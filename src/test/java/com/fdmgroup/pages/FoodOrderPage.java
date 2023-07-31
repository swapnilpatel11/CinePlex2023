package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodOrderPage {
	
	public static WebElement foodOrderLable(WebDriver driver) {
		return driver.findElement(By.xpath("//h1[text()='Get your movie snacks sooner']"));
	}
	
	public static WebElement selectTheatreDropdown(WebDriver driver) {
		return driver.findElement(By.id("select-theatre-dropdown"));
	}
	
	public static WebElement selectValueDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='menu-']//li[1]"));
	}
	
	public static WebElement viewMenuButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='VIEW MENU']"));
	}

}
