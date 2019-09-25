package com.unimoni.cucumber.glues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginFeautreGlues extends BaseGlue {
	
	
	@Given("^User is at login page$")
	public void user_is_at_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://browsers//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V1/index.php");		
	}

	@When("^User enters login name as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_login_name_as_and_password_as(String userName, String password) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);		
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^User should be allowed to login$")
	public void user_should_be_allowed_to_login() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//center/img")).isDisplayed());
	}

	@Then("^user should be in home page$")
	public void user_should_be_in_home_page() throws Throwable {
		Assert.assertEquals("GTPL Bank Manager HomePage", driver.getTitle().trim());
		System.out.println("From given..");
		driver.quit();
	}
	
	@Then("^user should not be allowed to login$")
	public void user_should_not_be_allowed_to_login() {
		driver.switchTo().alert().accept();
	}
	
	@Then("^user should not see home page$")
	public void user_should_not_see_home_page() throws Throwable {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("uid"))));
		Assert.assertEquals("GTPL Bank Home Page", driver.getTitle().trim());
		driver.quit();
	}
	
	@When("^User enters login name and password as$")
	public void user_enters_login_name_and_password_as(DataTable loginDetails) throws Throwable {
	    List<String> credentials = loginDetails.asList(String.class);
	    
	    driver.findElement(By.name("uid")).sendKeys(credentials.get(0));
		driver.findElement(By.name("password")).sendKeys(credentials.get(1));		
	    
	}
}
