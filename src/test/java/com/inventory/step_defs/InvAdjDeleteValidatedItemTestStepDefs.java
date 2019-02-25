package com.inventory.utilities.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class InvAdjDeleteValidatedItemTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager enters For Validation Test into search box")
    public void the_manager_enters_For_Validation_Test_into_search_box() {
        pages.invAdjustmentsPage().searchBox.sendKeys("For Validation Test");
    }

    @Then("verify For Validation Test item is displayed in the first place")
    public void verify_For_Validation_Test_item_is_displayed_in_the_first_place() {
        BrowserUtils.wait(3);
        Assert.assertTrue("the item name is wrong", pages.invAdjustmentsPage().forValidationTestItem.isDisplayed());
    }

    @When("the manager clicks on For Validation Test item from the list")
    public void the_manager_clicks_on_For_Validation_Test_item_from_the_list() {
        BrowserUtils.wait(3);
        pages.invAdjustmentsPage().forValidationTestItem.click();
    }

    @Then("verify the error message {string} is displayed")
    public void verify_the_error_message_is_displayed(String string) {
        Assert.assertTrue(pages.invAdjustmentsItemPage().validationDeleteErrorMessage.getText().contains("You cannot delete a validated inventory adjustement."));
    }
}
