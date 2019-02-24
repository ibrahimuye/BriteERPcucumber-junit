@na
Feature: Inventory manager should be able to create new Item
  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page

  @BRIT-197
  Scenario:Creating new product "Cybertek" in Product Valuation
    When the user is already on the inventory page
    When selects Inventory Valuation under reporting module
    Then valuation report pops up, user click on Current Inventory and selects Retrieve the Inventory valuation
#    Then verify page title has Product Valuation
    Then user presses on Create button
    When new page loads, user enters product information
    Then select save and pop up window should appear
    Then user clicks Save on pop up window and main page