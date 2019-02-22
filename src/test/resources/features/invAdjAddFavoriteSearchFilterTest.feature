@BRIT-908
Feature: Inventory manager should be able to add favorite search filter

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Adding favorite search filter

    And the manager clicks on Advance Search button if it is displayed
    When the manager enters "laptop" into search box
    And the manager presses enter
    And the manager clicks on Favorites dropdown menu
    And the manager clicks on Save current search from the dropdown list
    And the manager clears Save Current Search Text Box
    And the manager enters laptop in the Save Current Search Text Box
    And the manager presses enter
    Then verify laptop is saved as favorite search item
    And delete saved laptop favorite search item
    And the manager clicks on OK button
