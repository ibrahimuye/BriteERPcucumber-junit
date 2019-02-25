package com.inventory.step_defs;
import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ScrapDataTransferTestsStepDefs extends BrowserUtils {

    Pages pages = new Pages();
    Actions actions=new Actions(Driver.getDriver());

    @When("the user chooses all references to export")
    public void the_user_chooses_all_references_to_export() {
        pages.scrapPage().selectAllEntries.click();
        actions.moveToElement(pages.scrapPage().actionButton).perform();
        actions.click(pages.scrapPage().actionButton).perform();
        waitForClickablility(pages.scrapPage().exportButton, 5).click();

    }

    @When("chooses compatible export option with {string}")
    public void chooses_compatible_export_option_with(String string) {
        switch (string) {
            case "CSV":
                pages.scrapPage().CSVRadioButton.click();
                break;
            case "Excel":
                pages.scrapPage().excelRadioButton.click();
                break;

        }
        System.out.println(string);
    }

    @When("chooses fields one by one and clicks on add button and then export button Last Updated  By, Product, Quantity, Unit Of Measure")
    public void chooses_fields_one_by_one_and_clicks_on_add_button_and_then_export_button_Last_Updated_By_Product_Quantity_Unit_Of_Measure() {
        pages.scrapPage().lastUpdatedByButton.click();
        pages.scrapPage().addButton.click();
        pages.scrapPage().productButton.click();
        pages.scrapPage().addButton.click();
        pages.scrapPage().quantityButton.click();
        pages.scrapPage().addButton.click();
        pages.scrapPage().unitOfMeasureButton.click();
        pages.scrapPage().addButton.click();
        pages.scrapPage().exportToFileButton.click();
        wait(4);
        actions.moveToElement(pages.scrapPage().closeExportPage).perform();
        waitForClickablility(pages.scrapPage().closeExportPage,5).click();
    }

    @Then("verifies that the download folder contains the {string} file")
    public void verifies_that_the_download_folder_contains_the_downloaded_file(String string) {
        String downloads = null;
        switch (string) {
            case "CSV":
                downloads = "C:/Users/ibrah/Downloads/stock.scrap.xls"; // your download folders path
                break;
            case "Excel":
                downloads = "C:/Users/ibrah/Downloads/stock.scrap.csv"; // your download folders path
                break;


        }
        System.out.println(downloads);
        Assert.assertTrue(Files.exists(Paths.get(downloads)));
    }
}
