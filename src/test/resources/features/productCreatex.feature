#Feature:
#
#	#User Story: As an Inventory Manager I should be able to create product master data
#	#
#	#Acceptance Criteria:
#	#1. Verify that product can be created entering Product name,product type and category
#	#
#
#  Background: Access to the products page
#
#  Scenario: user access to the products page
#    Given that the user is already on the products page
#
#  @BRIT-4086 @Inventory
#  Scenario: Cucumber_As an Inventory Manager I should be able to create product master data
#
##1
#  @wip
#  Scenario Outline: creating new product with Product name,product type and product category
##    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#    And user Click on create link on top side of the page.
#    And user should navigate to the products new page.
#    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>"
#
#    When user click on save button on top
#    Then user should see product creation message
#
#    Examples:
#      | product_name | product_type | product_category |
#      | pencil543241 | Consumable   | All / Internal   |
#
#
##2
#
#  Scenario Outline: creating new product with Product name,product type and product category with zero price
##    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#    And user Click on create link on top side of the page.
#    And user should navigate to the products new page.
#    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>" and  "<sales_price>"
#
#    When user click on save button on top
#    Then user should see product creation message
#
#    Examples:
#      | product_name | product_type | product_category | sales_price |
#      | pencil543242 | Consumable   | All / Internal   | 0.00        |
#
# #3
#  Scenario Outline: created product can be seen on the product list once it is created
##    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#    Then the user click on the search bar and types product name "<product>" and hits enter.
#    Then user must be able to see the "<product>"
#    Examples:
#      | product     |
#      | pencil54324 |
##      | pencil123   |
#
#
#
#        #4
#
#  Scenario Outline: creating new product with same Product name,product type, product category
##    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#    And user Click on create link on top side of the page.
#    And user should navigate to the products new page.
#    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>"
#    When user click on save button on top
#    Then user should not see product creation message
#    Examples:
#      | product_name | product_type | product_category |
#      | pencil543242 | Consumable   | All / Internal   |
#
##5
#
#  Scenario Outline: product can not be created with empty product name
##    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#    And user Click on create link on top side of the page.
#    And user should navigate to the products new page.
#    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>"
#
#    When user click on save button on top
#    Then user should see "<error_message>" in error message
#    Examples:
#      | product_name | product_type | product_category | error_message |
#      |              | Consumable   | All / Internal   | Name          |
#
#		#6
#
#  Scenario Outline: product can not be created with empty product type
#
##    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#
#    And user Click on create link on top side of the page.
#    And user should navigate to the products new page.
#    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>"
#
#    When user click on save button on top
#    Then user should see "<error_message>" in error message
#    Examples:
#      | product_name | product_type | product_category | error_message |
#      | pencil54334  |              | All / Internal   | Product Type  |
#
#
#   		#7
#
#  Scenario Outline: product can not be created with empty category type
#
#   #    Given that the user is already on the inventory page
##    When user clicks on the products link
##    And user should navigate to the products page.
#
#    And user Click on create link on top side of the page.
#    And user should navigate to the products new page.
#    And user Fill product info "<product_name>" and  "<product_type>" and "<product_category>"
#
#    When user click on save button on top
#    Then user should see "<error_message>" in error message
#    Examples:
#      | product_name | product_type | product_category | error_message |
#      | pencil543345 | Consumable   |                  | Category      |
#
