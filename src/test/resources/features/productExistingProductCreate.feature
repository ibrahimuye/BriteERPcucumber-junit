@wip
Feature:
#4
  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    Then user clicks on the products link
    When user should navigate to the products page.

  Scenario Outline: creating new product with same Product name,product type, product category

    And user Click on create link on top side of the page.
    And user should navigate to the products new page.
    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>"
    When user click on save button on top
    Then user should not see product creation message
    Examples:
      | product_name | product_type | product_category |
      | pencil543241 | Consumable   | All / Internal   |
      | pencil543243 | Consumable   | All / Internal   |


