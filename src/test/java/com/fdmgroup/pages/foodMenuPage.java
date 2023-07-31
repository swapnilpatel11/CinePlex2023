package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class foodMenuPage {
	public static WebElement foodMenuLable(WebDriver driver) {
		return driver.findElement(By.id("Our-Menu"));
	}
	
	public static WebElement comboThree(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Combo Three']"));
	}
	
	public static WebElement comboName(WebDriver driver) {
		return driver.findElement(By.xpath("//h1[text()='Combo Three']"));
	}
	
	public static WebElement combeItems(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='1 large popcorns + 2 regular drinks + 1 candy']"));
	}
	
	public static WebElement comboPrice(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='$25.11']"));
	}
	
	public static WebElement caloriesCount(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='1380 Cals - 2420 Cals']"));
	}
	
	public static WebElement servesCount(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Serves 2']"));
	}
}
