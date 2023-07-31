Feature: Test send a gift card price on gift card page 

Scenario: User should able to check amount

Given User should launch application
And User click on Menu
And  User click on Gift Cards
And User reach on Gift cards page
And User click on Send an E-Gift Card button
When User enter all Value , Qauntity,Message, Recipient Name,Email on page 
And User click on Add to Cart button
Then User should able to see total amount of gift card