Feature: Test Login functionality for invalid credentials

Scenario: User cannot login with invalid credentials

Given User should launch application
And User click on Account button
And User click on Login button
When User enter invalid email and password
Then User should not able to login into account