
Feature: As an inventory user I should be able discard any Product and see the same records in DB

  Background: login and going to the inventory

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page

@BRIT-4458  @db
Scenario: As an inventory user I should be able to create scrap entry and see the same ref no in DB

  Given the user is already on the inventory page
  And user clicks on the scrap link
  And the user is on the scrap page
  And user clicks on the Create button
  And user uses default value of quantity
  When user clicks on product drop down menu to choose a product
  And user clicks on save button and then validate button
  And user clicks on the scrap link
  Then user must see the reference number of the entry in DB
  And user logs out

  @BRIT-4461 @db
Scenario:  As an inventory user I should be able to modify any scrap entry at UI confirm in DB

  Given the user is already on the inventory page
  And user clicks on the scrap link
  And the user is on the scrap page
  Then user edits the source document data of the latest entry and confirms the change in DB
  And user logs out



  @BRIT-4462  @uc    @db
Scenario Outline:    As an inventory user I should be able to create new products and verify in DB

  Given the user is already on the inventory page
  And user clicks on the products link
  And user clicks on the create button
  And user types the name of "<product>"
  And user click on the save button
  Then user validates the "<product>" in DB
  And user logs out

  Examples:
    | product |
    | Samsung Galaxy S6 active SM-G890A |
    | Samsung Galaxy S7 active SM-G895B |
    | Samsung Galaxy S8 active SM-G899C|

