package com.fdmgroup.testScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class BrokenFooterLinkStepTest {
	DriverUtilities driverUtilities = DriverUtilities.getInstance();
	WebDriver driver = driverUtilities.getDriver();
	
	
	@When("User should check http status code for Cineplex Digital Media")
	public void user_should_check_http_status_code_for_cineplex_digital_media() throws MalformedURLException, IOException {
	   String url = HomePage.footerDigitalMediaLink(driver).getAttribute("href");
	   HttpURLConnection con= (HttpURLConnection)new URL(url).openConnection();
	   con.setRequestMethod("HEAD");
	   con.connect();
	   int responseCode = con.getResponseCode();
	   System.out.println(responseCode);
	   
	}

	@Then("http status code validation it should not be broken link")
	public void http_status_code_validation_it_should_not_be_broken_link() throws MalformedURLException, IOException {
		String url = HomePage.footerDigitalMediaLink(driver).getAttribute("href");
		   HttpURLConnection con= (HttpURLConnection)new URL(url).openConnection();
		   con.setRequestMethod("HEAD");
		   con.connect();
		   int responseCode = con.getResponseCode();
		   assertEquals(DataFile.httpCode,responseCode);
	}
		

}
