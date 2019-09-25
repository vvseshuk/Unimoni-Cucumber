
Feature: Feature to explain data tables
  I want to use this template for my feature with data tables

Scenario: Positive login scenario with data table
    Given User is at login page    
    When User enters login name and password as 
    | mngr222872 	| apamyhy | 
    And clicks on login button
    Then User should be allowed to login
    And user should be in home page
    
    
    