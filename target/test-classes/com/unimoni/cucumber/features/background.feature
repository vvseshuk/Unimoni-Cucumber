Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
Background: User is Logged In
 Given User is at login page    
 When User enters login name as "mngr222872" and password as "apamyhy" 
 And clicks on login button
 Then User should be allowed to login
 
Scenario: User is able to click on New Customer link
 Given user is in home page
 When User click on New customer link
 Then User should see the new customer page