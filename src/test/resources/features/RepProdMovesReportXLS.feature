
Feature: Inventory/Reporting:Running Product Moves report in XLS and CSV

  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    Then User clicks on Product Moves
    Then User clicks on first checkbox to select all
    Then User clicks on Action button
    Then User clicks on Export button

#  @BRIT-1523, @BRIT-1524
  Scenario: Inventory Manager should be able to run report in Excel or CSV formats
    When Export Data page pops up
    When user selects  "<Export Type>"
    And Selects "<Export format>" type Excel or CSV
    Then in Available fields selects several lines and adds them: Consume Line, Date, Display name
    Then Runs the report by clicking on Export to File button
#    Then user closes the window

