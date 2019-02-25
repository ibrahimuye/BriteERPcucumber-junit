package com.inventory.utilities.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class InvAdjMainSearchTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager enters {string} into search box")
    public void the_manager_enters_into_search_box(String string) {
        pages.invAdjustmentsPage().searchBox.sendKeys("laptop");
    }

    @Then("Verify {string} and {string} options are displayed")
    public void verify_and_options_are_displayed(String string, String string2) {
        Assert.assertTrue("First search reference is wrong", pages.invAdjustmentsPage().SearchInventoryReference.getText().contains("Search Inventory Reference for:"));
        Assert.assertTrue("Second search reference is wrong", pages.invAdjustmentsPage().SearchInventoryProduct.getText().contains("Search Inventory Product for:"));
    }

    @When("the manager presses enter")
    public void the_manager_presses_enter() {
        pages.invAdjustmentsPage().searchBox.sendKeys("" + Keys.ENTER);
    }

    @Then("verify the first item containing {string} is displayed")
    public void verify_the_first_item_containing_is_displayed(String string) {
        Assert.assertTrue(pages.invAdjustmentsPage().FirstLaptopItem.isDisplayed());
    }
}
