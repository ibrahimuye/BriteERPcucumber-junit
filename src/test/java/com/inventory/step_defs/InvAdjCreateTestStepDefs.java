package com.inventory.utilities.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class InvAdjCreateTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager clicks on the create button")
    public void the_manager_clicks_on_the_create_button() {
        pages.invAdjustmentsPage().createButton.click();
    }

    @Then("the manager enters sample{int} to the inventory reference name box")
    public void the_manager_enters_sample_to_the_inventory_reference_name_box(Integer int1) {
        pages.invAdjustmentsItemPage().inventoryReferenceNameBox.sendKeys("sample1" + Keys.ENTER);
    }

    @Then("verify all products radio button is selected")
    public void verify_all_products_radio_button_is_selected() {
        Assert.assertTrue(pages.invAdjustmentsItemPage().allProductsRadioButton.isSelected());
    }

    @Then("the manager enters {int}\\/{int}\\/{int} on the Force Accounting Date box")
    public void the_manager_enters_on_the_Force_Accounting_Date_box(Integer int1, Integer int2, Integer int3) {
        pages.invAdjustmentsItemPage().forceAccountingDateBox.sendKeys("02/12/2019");
    }

    @Then("verify the inventory reference name header is Sample{int}")
    public void verify_the_inventory_reference_name_header_is_Sample(Integer int1) {
        Assert.assertTrue("inventory reference name header is wrong", pages.invAdjustmentsItemPage().inventoryReferenceNameHeader.getText().equals("sample1"));
    }
}
