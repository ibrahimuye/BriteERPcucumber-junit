package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RepCreateNewDef extends BrowserUtils {
    Pages pages = new Pages();

    @When("selects Inventory Valuation under reporting module")
    public void selects_Inventory_Valuation_under_reporting_module() {
        wait(3);
        pages.reportProdMovesPage().InventoryValuation.click();

    }
    @Then("valuation report pops up, user click on Current Inventory and selects Retrieve the Inventory valuation")
    public void valuation_report_pops_up_user_click_on_Current_Inventory_and_selects_Retrieve_the_Inventory_valuation() {
                pages.reportProdMovesPage().RetrieveInvVal.click();

    }

    @Then("verify page title has Product Valuation")
    public void verify_page_title_has_Product_Valuation() {
        wait(4);
        Assert.assertEquals("page title is wrong", "Product Valuation - Odoo", Driver.getDriver().getTitle());
    }

    @Then("user presses on Create button")
    public void user_presses_on_Create_button() {
        pages.reportProdMovesPage().createBtn.click();
    }

    @When("new page loads, user enters product information")
    public void new_page_loads_user_enters_product_information() {
       wait(4);
        pages.reportProdMovesPage().ProductNameInput.sendKeys("Cybertek");
        //pages.reportProdMovesPage().Servicedropdown.click();
        pages.reportProdMovesPage().InternalRef.sendKeys("123");
        pages.reportProdMovesPage().Barcode. sendKeys("321");
    }

    @Then("select save and pop up window should appear")
    public void select_save_and_pop_up_window_should_appear() {
    }

    @Then("user clicks Save on pop up window and main page")
    public void user_clicks_Save_on_pop_up_window_and_main_page() {
 //       waitForVisibility(pages.reportProdMovesPage().HeaderOpenCtg,5);
        wait(4);pages.reportProdMovesPage().SaveBtn2.click();

    }

}