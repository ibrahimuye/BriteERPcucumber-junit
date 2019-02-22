@regression
Feature: As an inventory user I should be able to export scrap data in xls or csv format
	#*User Story :* As an inventory user I should be able to import and export scrap data in xls or csv format
	#
	#*Acceptance Criteria:*
	# # As an inventory user I should be able to export scrap data in excel format
	# # As an inventory user I should be able to export scrap data in csv format
  Background: login and going to the scrap page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    Then user clicks on the scrap link
    When the user is on the scrap page


  @BRIT-4150
  Scenario Outline: As an inventory user I should be able to export scrap data in xls or csv format

    When the user chooses all references to export
    And chooses compatible export option with "<export data type>"
    And chooses fields one by one and clicks on add button and then export button Last Updated  By, Product, Quantity, Unit Of Measure
    Then verifies that the download folder contains the "<export data type>" file
    And user logs out

    Examples:
      | export data type |
      | CSV   |
      | Excel|
