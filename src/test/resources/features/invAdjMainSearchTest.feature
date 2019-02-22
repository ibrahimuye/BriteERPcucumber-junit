@BRIT-477
Feature: Inventory manager should be able to search in the Inventory Adjustment page

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Searching in the Inventory Adjustment page

    When the manager enters "laptop" into search box
    Then Verify "Search Inventory Reference for: laptop" and "Search Inventory Product for: laptop" options are displayed
    When the manager presses enter
    Then verify the first item containing "laptop" is displayed