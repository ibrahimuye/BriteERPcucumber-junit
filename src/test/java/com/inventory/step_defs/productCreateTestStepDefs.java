package com.inventory.step_defs;

import com.inventory.pages.ProductsPage;
import com.inventory.utilities.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static com.inventory.utilities.BrowserUtils.waitForClickablility;

public class productCreateTestStepDefs extends BrowserUtils {
    Pages pages = new Pages();

    private String str;

    @When("user clicks on the products link")
    public void user_clicks_on_the_products_link() {
        waitForClickablility(pages.inventoryPage().productsLink, 5);
        //  waitForPageToLoad(5);
        pages.inventoryPage().productsLink.click();
    }

    @When("user should navigate to the products page.")
    public void user_should_navigate_to_the_products_page() {
           wait(8);
        Assert.assertEquals("page title is wrong", "Products - Odoo", Driver.getDriver().getTitle());
    }

    @And("user Click on create link on top side of the page.")
    public void user_Click_on_create_link_on_top_side_of_the_page() {
        waitForClickablility(pages.productsPage().createProductsButton, 5);

        pages.productsPage().createProductsButton.click();
    }

    @And("user should navigate to the products new page.")
    public void user_should_navigate_to_the_products_new_page() {
        wait(5);
        //   waitForPageToLoad(5);
        Assert.assertTrue("page title doesn't contain 'New'", Driver.getDriver().getTitle().contains("New"));
    }

    @And("user Fill product info {string} and  {string} and {string}")
    public void user_Fill_product_info_and_and(String product_name, String product_type, String product_category) {
        //  pages.productsPage().createProductsButton.click();
        //   waitForPageToLoad(5);
        wait(3);
        pages.productsPage().productsNewProductName.sendKeys(product_name);
        wait(3);
        pages.productsPage().productsNewProductTypeList().selectByVisibleText(product_type);
        wait(3);
        pages.productsPage().productsNewCategory.clear();
        wait(3);
        pages.productsPage().productsNewCategory.sendKeys(product_category);
        // waitForVisibility(pages.productsPage().productsNewCategory, 5);
        //  pages.productsPage().productsNewCategory.sendKeys("         " + Keys.ENTER);
    }

    @Given("user Fill product info {string} and  {string} and {string} and  {string}")
    public void user_Fill_product_info_and_and_and(String product_name, String product_type, String product_category, String sales_price) {
        wait(3);
        pages.productsPage().productsNewProductName.sendKeys(product_name);
        wait(3);
        pages.productsPage().productsNewProductTypeList().selectByVisibleText(product_type);
        pages.productsPage().productsNewSalesPrice.clear();
        pages.productsPage().productsNewSalesPrice.sendKeys(sales_price);
        wait(3);
        pages.productsPage().productsNewCategory.clear();
        wait(3);
    }


    @When("user click on save button on top")
    public void user_click_on_save_button_on_top() {
        wait(3);
        pages.productsPage().productsNewSave.click();

        pages.productsPage().inventoryLink.click();

    }

    @Then("user should see product creation message")
    public void user_should_see_product_creation_message() {
        Assert.assertEquals("Product Template is not created", pages.productsPage().productCreated.getText(), ApplicationConstants.PRODUCT_TEMPLATE_CREATED);
        //  pages.inventoryPage().productsLink.click();
    }

    @Then("user should not see product creation message")
    public void user_should_not_see_product_creation_message() {
        Assert.assertNotEquals("Product Template is created", pages.productsPage().productCreated.getText(), ApplicationConstants.PRODUCT_TEMPLATE_CREATED);
    }


    @Then("the user click on the search bar and types product name {string} and hits enter.")
    public void the_user_click_on_the_search_bar_and_typyes_product_name_and_hits_enter(String product_name) {
        pages.productsPage().productSearchBox.sendKeys(product_name + Keys.ENTER);

    }

    @Then("user must be able to see the {string}")
    public void user_must_be_able_to_see_the(String product_name) {
String str=pages.productsPage().productFoundProduct.getText();
        Assert.assertTrue("searched item could not be found", pages.productsPage().productFoundProduct.getText().contains(product_name));
    }

    @Then("user should see {string} in error message")
    public void user_should_see_in_error_message(String errorMessage) {
        if (!errorMessage.contains("ategory")) {
            waitForVisibility(pages.productsPage().productNotificationMessage, 3);
            String str = pages.productsPage().productNotificationMessage.getText();
            Assert.assertTrue("Message doesn't contain " + errorMessage, str.contains(errorMessage));


        }
    }


}



