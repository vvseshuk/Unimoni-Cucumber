package com.unimoni.cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		plugin = {"pretty", "html:target/htmlreports"},
		features = "src\\test\\java\\com\\unimoni\\cucumber\\features",
		glue = {"com.unimoni.cucumber.glues"},
		tags = {"@Regression", "~@Positive"}
		)
public class LoginRunner {

}
