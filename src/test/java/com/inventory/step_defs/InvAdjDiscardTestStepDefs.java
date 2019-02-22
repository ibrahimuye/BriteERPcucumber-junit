package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class InvAdjDiscardTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @Then("verify the inventory reference name header is New")
    public void verify_the_inventory_reference_name_header_is_New() {
        BrowserUtils.wait(3);
        Assert.assertTrue("Name header is wrong", pages.invAdjustmentsItemPage().newInvAdjHeader.getText().contains("New"));
    }

    @When("the manager clicks on discard button")
    public void the_manager_clicks_on_discard_button() {
        pages.invAdjustmentsItemPage().discardButton.click();
    }

    @Then("verify the inventory reference name header is empty")
    public void verify_the_inventory_reference_name_header_is_empty() {
        BrowserUtils.wait(2);
        Assert.assertFalse(pages.invAdjustmentsItemPage().newInvAdjHeader.getText().equals("New"));
    }
}
