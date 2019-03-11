package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class InvAdjRemoveGlobalSearchFilterTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @Then("the manager clicks on Delete global search filter")
    public void the_manager_clicks_on_Delete_global_search_filter() {
        pages.invAdjustmentsPage().removeFilterIcon.click();
    }

    @Then("verify the error message is displayed")
    public void verify_the_error_message_is_displayed() {
        Assert.assertTrue("no error message found", pages.invAdjustmentsPage().globalFilterDeleteErrorMessage.getText().contains("The requested operation cannot be completed due to security restrictions. Please contact your system administrator."));
    }
}
