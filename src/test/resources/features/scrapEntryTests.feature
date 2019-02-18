@regression
Feature: As an inventory user I should be able discard some of the available quantity of any Stockable Product
  #*User Story :* As an inventory user I should be able discard some of the available quantity of any Stock-able Product
	#
	#*Acceptance Criteria:*
	# # As an inventory user I should be able to create a scrap entry to discard the on hand quantity of any Stock-able Product after filling required data,
	# # As an inventory user I should be able to search scrap data using "product name",
	# # As an inventory user I should +*not*+ be able to edit quantity of scrap data entered before,

  Background: login and going to the inventory

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page

  @BRIT-4020 @smoke
  Scenario: As an inventory user I should not be able to create scrap entry without source document

    Given the user is already on the inventory page
    Then user clicks on the scrap link
    When the user is on the scrap page
    Then user clicks on the Create button
    Then user clicks on product drop down menu to choose a product
    And user uses default value of quantity
    And user leaves the source document as blank
    Then user clicks on save button and then validate button
    Then user must see an error message of "to create a scrap entry, a source document is required" on the page
    Then user logs out


#    we created background manually, scnerio is from JIRA
#  whatever we write as tag in JIRA appears here as tag in addition to the JIRA Key, since we have written before inventorty and online 2
#  we have deleted these, we can add meaningful tags

#  last phrase of the background is as same as first step of scenario to see that we all done in dry run
#  we have extented step def classes to Browser utilities to use all useful methods

  @BRIT-4120 @smoke
  Scenario: As an inventory user I should be able discard any of the available quantity of any Stock-able Product

    Given the user is already on the inventory page
    When Click on the Products link
    And record the initial on hand quantity
    And user clicks on the scrap link
    And the user is on the scrap page
    And user clicks on the Create button
    And user clicks on product drop down menu to choose a product
    And user uses default value of quantity
    And user clicks on save button and then validate button
    And Click on the Products link
    And record the final on hand quantity
    Then user validates the number of on hand quantity at this stage is less than initial amount by scrapped amount
    And user logs out


  @BRIT-4121 @smoke
  Scenario Outline: As an inventory user I should be able to search scrap data using "product name"

    Given the user is already on the inventory page
    And user clicks on the scrap link
    When the user is on the scrap page
    And the user click on the search bar and typyes product name "<product>" and hits enter
    Then user must be able to see the "<product>" in the first raw
    And user logs out

    Examples:

      | product |
      | mouse   |
      | ipad    |


  @BRIT-4122
  Scenario: As an inventory user I should not be able to create scrap entry without quantity

    Given the user is already on the inventory page
    And user clicks on the scrap link
    And the user is on the scrap page
    And user clicks on the Create button
    And user enters zero for quantity
    When user clicks on product drop down menu to choose a product
    And user clicks on save button and then validate button
    Then user must see an error message of "to create a scrap entry, a quantity is required" on the page
    And user logs out

