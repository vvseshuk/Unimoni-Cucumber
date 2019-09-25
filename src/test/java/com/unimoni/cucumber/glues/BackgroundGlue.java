package com.unimoni.cucumber.glues;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundGlue extends BaseGlue {
	
	@Given("^user is in home page$")
	public void user_is_in_home_page() throws Throwable {
		Assert.assertEquals("GTPL Bank Manager HomePage", driver.getTitle().trim());
	}

	@When("^User click on New customer link$")
	public void user_click_on_New_customer_link() throws Throwable {
		driver.findElement(By.linkText("New Customer")).click();
		
	}

	@Then("^User should see the new customer page$")
	public void user_should_see_the_new_customer_page() throws Throwable {
		Assert.assertEquals("Gtpl Bank New Customer Entry Page", driver.getTitle().trim());
		driver.quit();
	}

}
