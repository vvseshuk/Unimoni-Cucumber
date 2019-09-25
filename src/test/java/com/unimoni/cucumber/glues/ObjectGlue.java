package com.unimoni.cucumber.glues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ObjectGlue {
	
	WebDriver driver;

	@Given("^user is at shopping cart site$")
	public void user_is_at_shopping_cart_site() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://browsers//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");	
		
	}

	@Given("^user clicked on sign-in$")
	public void user_clicked_on_sign_in() throws Throwable {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^user enters already registered login details$")
	public void user_enters_already_registered_login_details(List<SignIn> rows) throws Throwable {
		SignIn row = rows.get(0);
		driver.findElement(By.name("email")).sendKeys(row.getEmail());
		driver.findElement(By.name("passwd")).sendKeys(row.getPassword());
	
	}

	@When("^user clicks on sign-in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("^user should not sign-in$")
	public void user_should_not_sign_in() throws Throwable {
		Assert.assertEquals("Authentication failed.", driver.findElement(By.xpath("//ol/li")).getText());
		driver.quit();
	}

}
