@Regression
Feature: Feature to explain the objects as data tables
  I want to use this template for my feature with objects

  Scenario: Negative login scenario
    Given user is at shopping cart site
    And user clicked on sign-in
    When user enters already registered login details
    |	email						|	password	|
    | abc@gmail.com 	|	1234a 		|
    	
    And user clicks on sign-in button
    Then user should not sign-in
    

  