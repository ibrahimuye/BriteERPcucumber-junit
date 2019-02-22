@smokeTest
Feature: As an inventory manager I should be able to verify the system is up and running

  Background: login and going to the inventory

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page

    @BRIT-3537
Scenario: Go to inventory adjustments page

  When the manager clicks on the inventory Adjustment link
  Then verify page title contains Inventory Adjustments


  @BRIT-3546
  Scenario: Inventory Manager should be able to see certain buttons and links in the Inventory Adjustment page

    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments
    Then verify the first header is Inventory Reference
    Then verify the second header is Inventory Date
    Then verify the third header is Status
    And the manager clicks on Advance Search button if it is displayed
    Then verify the first dropdown header is Filter
    Then verify the second dropdown header is Group By
    Then verify the third dropdown header is Favorites

    @BRIT-888
    Scenario: Inventory Manager should be able to see Kanban View of the Inventory Adjustment Page

      When the manager clicks on the inventory Adjustment link
      Then verify page title contains Inventory Adjustments
      When the manager clicks on Kanban box from the right upper corner of the window
      Then verify the items are displayed in the Kanban format
