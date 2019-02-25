@wip1
Feature:
#3
  Background: login and going to the inventory
    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    Then user clicks on the products link
    When user should navigate to the products page.

  Scenario Outline: created product can be seen on the product list once it is created

    Then the user click on the search bar and types product name "<product>" and hits enter.
    Then user must be able to see the "<product>"
    Examples:
      | product     |
      | pencil54324 |
      | pencil123   |

