package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.DatabaseUtility;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ScrapDBTestStepDefs extends BrowserUtils {

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

    @Then("user edits the source document data of the latest entry and confirms the change in DB")
    public void user_edits_the_source_document_data_of_the_latest_entry_and_confirms_the_change_in_DB() {
        pages.scrapPage().lastreferenceOnWebTable.click();
        wait(4);
        pages.scrapPage().editButton.click();
        String sourceDocUI = "UYE666";
        pages.scrapPage().sourceDocInput.sendKeys(sourceDocUI);
        pages.scrapPage().saveButton.click();
        String sql = "SELECT origin FROM stock_scrap ORDER BY name DESC;";
        String sourceDocDB =DatabaseUtility.getCellValue(sql).toString();
        System.out.println(sourceDocDB);
        Assert.assertEquals("DB and UI values are not same",sourceDocUI,sourceDocDB);
    }

}
