@uc
Feature: As an inventory user I should be able create new Products from xls and see the same records in DB

  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page

@BRIT-4483  @db
Scenario: creating new products from xls file and verifying in DB
  Given the user is already on the inventory page
  And user clicks on the products link
  And user clicks on the create button
  Then user types the name of the product from Excel file and validates in DB
  And user logs out



