package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.When;

public class InvAdjDuplicateTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager selects Duplicate from dropdown menu")
    public void the_manager_selects_Duplicate_from_dropdown_menu() {
        BrowserUtils.waitForClickablility(pages.invAdjustmentsItemPage().duplicateButton, 3);
        pages.invAdjustmentsItemPage().duplicateButton.click();
    }

}
