
Feature: Login feature with scenario outline examples
  I want to use this template for my login feature with scenario outline

  Scenario Outline: Negative Login scenarios with different data sets
    Given User is at login page
  	When User enters login name as "<name>" and password as "<pwd>"
  	And clicks on login button
  	Then user should not be allowed to login 
  	And user should not see home page
    Examples: 
      | name  | 		pwd		| 
      | name1 |     pws1 	| 
      | name2 |     pws2 	| 
