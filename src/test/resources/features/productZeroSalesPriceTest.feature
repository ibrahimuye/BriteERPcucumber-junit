@wip
Feature:
#2
  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    Then user clicks on the products link
    When user should navigate to the products page.

  Scenario Outline: creating new product with Product name,product type and product category with zero price

    And user Click on create link on top side of the page.
    And user should navigate to the products new page.
    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>" and  "<sales_price>"

    When user click on save button on top
    Then user should see product creation message

    Examples:
      | product_name | product_type | product_category | sales_price |
      | pencil543242 | Consumable   | All / Internal   | 0.00        |