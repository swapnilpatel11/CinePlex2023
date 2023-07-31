Feature: Test Search Functionality to find movie by name

Scenario: Search Movie name 

Given User should launch application
When User enter movie name and click enter
Then User should get result according to data enter


Scenario: Get Movie Genre of search result

Given User should launch application
And User enter movie name and click enter
And User should get result according to data enter
When User click on first result of movie show times
Then User should be able to see Genre
