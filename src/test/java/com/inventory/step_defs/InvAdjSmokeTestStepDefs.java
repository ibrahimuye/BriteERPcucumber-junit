package com.inventory.utilities.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class InvAdjSmokeTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager clicks on the inventory Adjustment link")
    public void the_manager_clicks_on_the_inventory_Adjustment_link() {
        pages.inventoryPage().invAdjustmentsLink.click();
        BrowserUtils.wait(3);
    }

    @Then("verify page title contains Inventory Adjustments")
    public void verify_page_title_contains_Inventory_Adjustments() {
        Assert.assertEquals("page title is wrong", "Inventory Adjustments - Odoo", Driver.getDriver().getTitle());
    }

    @Then("verify the first header is Inventory Reference")
    public void verify_the_first_header_is_Inventory_Reference() {
        Assert.assertEquals("first header is wrong", "Inventory Reference", pages.invAdjustmentsPage().inventoryReferenceHeader.getText());
    }

    @Then("verify the second header is Inventory Date")
    public void verify_the_second_header_is_Inventory_Date() {
        Assert.assertEquals("Second header is wrong", "Inventory Date", pages.invAdjustmentsPage().inventoryDateHeader.getText());
    }

    @Then("verify the third header is Status")
    public void verify_the_third_header_is_Status() {
        Assert.assertEquals("Third header is wrong", "Status", pages.invAdjustmentsPage().statusHeader.getText());

    }

    @Then("the manager clicks on Advance Search button if it is displayed")
    public void the_manager_clicks_on_Advance_Search_button_if_it_is_displayed() {
        if(pages.invAdjustmentsPage().advancedSearchButton.isDisplayed())
            pages.invAdjustmentsPage().advancedSearchButton.click();
    }

    @Then("verify the first dropdown header is Filter")
    public void verify_the_first_dropdown_header_is_Filter() {
        Assert.assertEquals("First dropdown header is wrong", "Filters", pages.invAdjustmentsPage().filterDropdown.getText());
    }

    @Then("verify the second dropdown header is Group By")
    public void verify_the_second_dropdown_header_is_Group_By() {
        Assert.assertEquals("Second dropdown header is wrong", "Group By", pages.invAdjustmentsPage().groupByDropdown.getText());
    }

    @Then("verify the third dropdown header is Favorites")
    public void verify_the_third_dropdown_header_is_Favorites() {
        Assert.assertEquals("Third dropdown is wrong", "Favorites", pages.invAdjustmentsPage().favoritesDropdown.getText());
    }

    @When("the manager clicks on Kanban box from the right upper corner of the window")
    public void the_manager_clicks_on_Kanban_box_from_the_right_upper_corner_of_the_window() {
        pages.invAdjustmentsPage().kanbanViewButton.click();
    }

    @Then("verify the items are displayed in the Kanban format")
    public void verify_the_items_are_displayed_in_the_Kanban_format() {
        Assert.assertTrue(pages.invAdjustmentsPage().kanbanViewDisplay.isDisplayed());
    }
}
