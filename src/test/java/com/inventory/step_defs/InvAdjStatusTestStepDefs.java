package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class InvAdjStatusTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager enters {string} in the search box")
    public void the_manager_enters_in_the_search_box(String string) {
        pages.invAdjustmentsPage().searchBox.sendKeys("For Status Test");
    }

    @Then("verify For status Test item is displayed in the first place")
    public void verify_For_status_Test_item_is_displayed_in_the_first_place() {
        Assert.assertTrue("displayed item is wrong", pages.invAdjustmentsPage().forStatusTestItem.getText().equals("For Status Test"));
    }

    @When("the manager clicks on For status test item")
    public void the_manager_clicks_on_For_status_test_item() {
        pages.invAdjustmentsPage().forStatusTestItem.click();
    }


    @Then("verify the status of the item is Draft")
    public void verify_the_status_of_the_item_is_Draft() {
        Assert.assertTrue(pages.invAdjustmentsItemPage().draftStatusTab.isDisplayed());
    }

    @Then("the manager selects Select products manually option")
    public void the_manager_selects_Select_products_manually_option() {
        pages.invAdjustmentsItemPage().selectProductsManuallyRadioButton.click();
    }

    @Then("the manager clicks on start inventory button")
    public void the_manager_clicks_on_start_inventory_button() {
        pages.invAdjustmentsItemPage().startInventoryButton.click();
    }

    @Then("verify the status of the item is In Progress")
    public void verify_the_status_of_the_item_is_In_Progress() {
        Assert.assertTrue(pages.invAdjustmentsItemPage().inProgressStatusTab.isDisplayed());
    }

    @Then("the manager clicks on start Validate button")
    public void the_manager_clicks_on_start_Validate_button() {
        pages.invAdjustmentsItemPage().validateInventoryButton.click();
    }

    @Then("verify the status of the item is Validated")
    public void verify_the_status_of_the_item_is_Validated() {
        Assert.assertTrue(pages.invAdjustmentsItemPage().validatedStatusTab.isDisplayed());
    }
}
