package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
	
	public static WebElement resultPage(WebDriver driver){
		return driver.findElement(By.className("inverted"));
	}	
	public static WebElement findShowTimeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='https://www.cineplex.com/Movie/mission-impossible-dead-reckoning-part-one?deeplink=true']"));
	}
	
	public static WebElement genreName(WebDriver driver) {
		return driver.findElement(By.xpath("//p[text()='Action, Adventure, Thriller']"));
	}

}
