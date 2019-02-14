@uc
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

  @BRIT-4020
  Scenario: As an inventory user I should not be able to create scrap entry without source document

    Given the user is already on the inventory page
    Then user clicks on the scrap link
    When the user is on the scrap page
    Then user clicks on the Create button
    Then page title contains new
    Then user clicks on product drop down menu to choose a product
    And user uses default value of quantity
    And user leaves the source document as blank
    Then user clicks on save button
    Then user clicks on validate button
    Then user must see an error message of "to create a scrap entry, a source document is required" on the page


#    we created background manually, scnerio is from JIRA
#  whatever we write as tag in JIRA appears here as tag in addition to the JIRA Key, since we have written before inventorty and online 2
#  we have deleted these, we can add meaningful tags

#  last phrase of the background is as same as first step of scenario to see that we all done in dry run
#  we have extented step def classes to Browser utilities to use all useful methods