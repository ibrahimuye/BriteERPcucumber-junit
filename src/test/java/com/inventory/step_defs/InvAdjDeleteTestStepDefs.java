package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class InvAdjDeleteTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager enters For delete test final item to search box")
    public void the_manager_enters_For_delete_test_final_item_to_search_box() {
        pages.invAdjustmentsPage().searchBox.sendKeys("For delete test final");
    }

    @When("the manager clicks on For delete test final item from the list")
    public void the_manager_clicks_on_For_delete_test_final_item_from_the_list() {
        BrowserUtils.wait(3);
        pages.invAdjustmentsPage().forDeleteTestFinalItem.click();
    }

    @When("the manager clicks on Action dropdown menu")
    public void the_manager_clicks_on_Action_dropdown_menu() {
        BrowserUtils.waitForClickablility(pages.invAdjustmentsItemPage().actionButton, 3);
        pages.invAdjustmentsItemPage().actionButton.click();
        //actions.(pages.invAdjustmentsItemPage().actionButton).perform();
        //actions.click(pages.invAdjustmentsItemPage().actionButton).perform();
    }

    @When("the manager selects Delete from dropdown menu")
    public void the_manager_selects_Delete_from_dropdown_menu() {
        BrowserUtils.waitForClickablility(pages.invAdjustmentsItemPage().deleteButton, 3);
        pages.invAdjustmentsItemPage().deleteButton.click();
    }

    @When("the manager clicks on Ok button in the pop up window")
    public void the_manager_clicks_on_Ok_button_in_the_pop_up_window() {
        pages.invAdjustmentsItemPage().deleteOkButton.click();
    }

    @When("the manager clicks on create button")
    public void the_manager_clicks_on_create_button() {
        BrowserUtils.wait(3);
        pages.invAdjustmentsItemPage().createButton.click();
    }

    @When("the manager enters For delete test final to the inventory reference name box")
    public void the_manager_enters_For_delete_test_final_to_the_inventory_reference_name_box() {
        pages.invAdjustmentsItemPage().inventoryReferenceNameBox.sendKeys("For delete test final");
    }

    @Then("verify the inventory reference name header is For delete test final")
    public void verify_the_inventory_reference_name_header_is_For_delete_test_final() {
        Assert.assertTrue("Name header is wrong", pages.invAdjustmentsItemPage().inventoryReferenceNameHeader.getText().equals("For delete test final"));
    }
}
