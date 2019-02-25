package com.inventory.utilities.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class InvAdjEditTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @Then("the manager enters Inventory Transfer to search box")
    public void the_manager_enters_Inventory_Transfer_to_search_box() {
        pages.invAdjustmentsPage().searchBox.sendKeys("inventory transfer" + Keys.ENTER);
    }

    @Then("verify the item is displayed in the first place")
    public void verify_the_item_is_displayed_in_the_first_place() {
        Assert.assertTrue(pages.invAdjustmentsPage().inventoryTransferItem.isDisplayed());
    }

    @When("the manager clicks on the first Inventory Transfer item from the list")
    public void the_manager_clicks_on_the_first_Inventory_Transfer_item_from_the_list() {
        pages.invAdjustmentsPage().inventoryTransferItem.click();
    }

    @When("the manager clicks on the edit button")
    public void the_manager_clicks_on_the_edit_button() {
        pages.invAdjustmentsItemPage().editButton.click();
    }

    @When("the manager enters Inventory Transfer List to the inventory reference name box")
    public void the_manager_enters_Inventory_Transfer_List_to_the_inventory_reference_name_box() {
        pages.invAdjustmentsItemPage().inventoryReferenceNameBox.clear();
        pages.invAdjustmentsItemPage().inventoryReferenceNameBox.sendKeys("inventory transfer list" + Keys.ENTER);
    }


    @When("the manager clicks on the save button")
    public void the_manager_clicks_on_the_save_button() {
        pages.invAdjustmentsItemPage().saveButton.click();
    }

    @Then("verify the Inventory Transfer List appears in the header")
    public void verify_the_Inventory_Transfer_List_appears_in_the_header() {
        Assert.assertTrue("Name header is wrong", pages.invAdjustmentsItemPage().inventoryReferenceNameHeader.getText().equals("inventory transfer list"));
    }
        @Then("the manager enters Inventory Transfer to the inventory reference name box")
    public void the_manager_enters_Inventory_Transfer_to_the_inventory_reference_name_box() {
            pages.invAdjustmentsItemPage().inventoryReferenceNameBox.sendKeys("inventory transfer" + Keys.ENTER);
        }
    }

