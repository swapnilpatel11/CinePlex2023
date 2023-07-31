Feature: Test Food and Drink page for order food to validate combo name,price,items,calories,serves

Scenario: User should be able to see Combo Name,Price,Items,Calories and Serves

Given User should launch application
And User click on Menu
And User click on food & drink button
And User reach to food & drink page
And User click on order now button
And User reach on order now page
When User select mobile pick up location from dropdown
And User click on view menu 
And User reach on food menu page
And User click on combo three
Then User should be able see Combo Name, Price,Items, Calories and Serves
