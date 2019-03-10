package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.DatabaseUtility;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class dataBaseTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();
    Actions actions = new Actions(Driver.getDriver());

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
        String sourceDocUI = "UYE111";
        pages.scrapPage().sourceDocInput.clear();
        pages.scrapPage().sourceDocInput.sendKeys(sourceDocUI);
        pages.scrapPage().saveButton.click();
        String sql = "SELECT origin FROM stock_scrap ORDER BY name DESC;";
        String sourceDocDB =DatabaseUtility.getCellValue(sql).toString();
        System.out.println(sourceDocDB);
//        Assert.assertTrue("DB and UI values are not same",sourceDocDB.contains(sourceDocUI));
        Assert.assertEquals("DB and UI values are not same",sourceDocUI,sourceDocDB);
    }

    @Given("user clicks on the products link")
    public void user_clicks_on_the_products_link() {
        pages.inventoryPage().productsLink.click();
        wait(4);

    }

    @Given("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        waitForClickablility(pages.productsPage().createProductsButton,4).click();
    }

    @Given("user types the name of {string}")
    public void user_types_the_name_of(String string) {

        actions.moveToElement(pages.productsPage().productsNewProductType).sendKeys(string).perform();

    }

    @Given("user click on the save button")
    public void user_click_on_the_save_button() {
        pages.productsPage().productsNewSave.click();
        wait(5);// wait for synchronization
    }

    @Then("user validates the {string} in DB")
    public void user_validates_the_in_DB(String string) {
        String sql = "SELECT name FROM product_template ORDER BY create_date DESC;";
        String stringDB = DatabaseUtility.getCellValue(sql).toString();
        System.out.println(stringDB);
        Assert.assertEquals("DB and UI values are not same",string,stringDB);
    }

}
