package com.inventory.step_defs;

import com.inventory.utilities.DatabaseUtility;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ScrapDBTestStepDefs {

    Pages pages = new Pages();

    @Then("user must see the reference number of the entry in DB")
    public void user_must_see_the_reference_number_of_the_entry_in_DB() {
        String referenceOnUI = pages.scrapPage().lastreferenceOnWebTable.getText();
        System.out.println("on UI :"+referenceOnUI);
        String sql = "SELECT name FROM stock_scrap ORDER BY name DESC;";
        String referenceAtDB= DatabaseUtility.getCellValue(sql).toString();
        System.out.println("on DB :"+referenceAtDB);
        Assert.assertEquals("DB and UI values are not same",referenceOnUI,referenceAtDB);
    }

}
