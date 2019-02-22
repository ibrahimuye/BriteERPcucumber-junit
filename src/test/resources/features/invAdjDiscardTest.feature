@BRIT-877
Feature: Inventory manager should be able to discard Inventory Adjustment

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Discarding Inventory Adjustment

    When the manager clicks on the create button
    Then verify the inventory reference name header is New
    When the manager clicks on discard button
    Then verify the inventory reference name header is empty
