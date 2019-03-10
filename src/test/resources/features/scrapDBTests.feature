@uc
Feature: As an inventory user I should be able discard any Product and see the same records in DB

  Background: login and going to the inventory

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page

@BRIT-4458  @db
Scenario: As an inventory user I should be able to create scrap entry and see the same ref no in DB

Given the user is already on the inventory page
And user clicks on the scrap link
And the user is on the scrap page
And user clicks on the Create button
And user uses default value of quantity
When user clicks on product drop down menu to choose a product
And user clicks on save button and then validate button
And user clicks on the scrap link
Then user must see the reference number of the entry in DB
And user logs out