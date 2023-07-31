package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebElement emailField(WebDriver driver) {
		
		return driver.findElement(By.id("txtEmailAddress"));
	}
	
	public static WebElement passwordField(WebDriver driver) {
		
		return driver.findElement(By.id("txtPassword"));
	}
	
	public static WebElement logInButton(WebDriver driver) {
		
		return driver.findElement(By.id("btnLogin"));
	}
	public static WebElement closeButton(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[contains(@class,'close')]"));
	}
	
	
	
}
