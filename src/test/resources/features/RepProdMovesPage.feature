
Feature: Inventory manager should be able to access Product moves
  in Inventory tab and access Export feature

  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
#  @BRIT-4044
  Scenario: User should be able to open Product Moves page

    Given the user is already on the inventory page
    Then User clicks on Product Moves
    Then User clicks on first checkbox to select all
    Then User clicks on Action button
    Then User clicks on Export button
    Then Export Data page pops up
    Then Close Export Data page

# @smoke
  Scenario: Inventory Manager should be able to see headers of the table and certain buttons on Product Moves page

    When user clicks on the Product Moves link
    Then verify the first header is Date
    Then verify the first header is Reference
    Then verify the second header is Product
    Then verify the third header is From
    Then verify the fourth header is To
    Then verify the fifth header is Quantity Done
    Then verify List button is clickable
    And  click on Kanban button
    And  select Pivot button