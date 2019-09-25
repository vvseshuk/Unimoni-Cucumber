@Regression
Feature: Login feautre
  The online demo banking site - we want to cover scenarios

	@Positive
  Scenario: Positive login scenario
    Given User is at login page    
    When User enters login name as "mngr222872" and password as "apamyhy" 
    And clicks on login button
    Then User should be allowed to login
    And user should be in home page
  
  @Negative
  Scenario: Negative login scenario
  	Given User is at login page
  	When User enters login name as "mngr" and password as "ap"
  	And clicks on login button
  	Then user should not be allowed to login
  	And user should not see home page