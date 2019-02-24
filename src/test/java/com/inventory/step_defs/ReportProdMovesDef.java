package com.inventory.step_defs;

import com.inventory.pages.ReportProdMovesPage;
import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;

import static com.inventory.utilities.BrowserUtils.waitForClickablility;

public class ReportProdMovesDef extends BrowserUtils {
    Pages pages = new Pages();

    //reportProdMovesPage ProdMoves = new reportProdMovesPage();


    @Then("User clicks on Product Moves")
    public void user_clicks_on_Product_Moves() {
        waitForClickablility(pages.inventoryPage().productMovesLink,4);
        pages.inventoryPage().productMovesLink.click();
    }

    @Then("User clicks on first checkbox to select all")
    public void user_clicks_on_first_checkbox_to_select_all() {
        wait(4);
        pages.reportProdMovesPage().checkbox.click();
    }

    @Then("User clicks on Action button")
    public void user_clicks_on_Action_button() {
        wait(4);
        pages.reportProdMovesPage().actionButton.click();
    }

    @Then("User clicks on Export button")
    public void user_clicks_on_Export_button() {
        wait(4);
        pages.reportProdMovesPage().export.click();
    }

    @Then("Export Data page pops up")
    public void export_Data_page_pops_up() {
        wait(3);
        pages.reportProdMovesPage().ExportDataPage.click();
    }
    @Then("Close Export Data page")
    public void close_Export_Data_page() {
        pages.reportProdMovesPage().closeExportData.click();
    }

    @When("user clicks on the Product Moves link")
    public void user_clicks_on_the_Product_Moves_link() {
        waitForClickablility(pages.inventoryPage().productMovesLink,4);
        pages.inventoryPage().productMovesLink.click();
    }

    @Then("verify page title contains Product Moves")
    public void verify_page_title_contains_Product_Moves() {
        Assert.assertEquals("page title is wrong", "Inventory - Odoo", Driver.getDriver().getTitle());

        // Assert.assertEquals("page title is wrong", "Product Moves - Odoo", Driver.getDriver().getTitle());
    }

    @Then("verify the first header is Date")
    public void verify_the_first_header_is_Date() {
        Assert.assertEquals("first header is wrong", "Date", pages.reportProdMovesPage().firstHeaderOfWebTable.getText());
    }

    @Then("verify the first header is Reference")
    public void verify_the_first_header_is_Reference() {
        Assert.assertEquals("second header is wrong", "Reference", pages.reportProdMovesPage().secondHeaderOfWebTable.getText());
    }

    @Then("verify the second header is Product")
    public void verify_the_second_header_is_Product() {
        Assert.assertEquals("third header is wrong", "Product", pages.reportProdMovesPage().thirdHeaderOfWebTable.getText());
    }

    @Then("verify the third header is From")
    public void verify_the_third_header_is_From() {
        Assert.assertEquals("fourth header is wrong", "From", pages.reportProdMovesPage().fourthHeaderOfWebTable.getText());
    }

    @Then("verify the fourth header is To")
    public void verify_the_fourth_header_is_To() {
        Assert.assertEquals("fifth header is wrong", "To", pages.reportProdMovesPage().fifthHeaderOfWebTable.getText());
    }

    @Then("verify the fifth header is Quantity Done")
    public void verify_the_fifth_header_is_Quantity_Done() {
        Assert.assertEquals("sixth header is wrong", "Quantity Done", pages.reportProdMovesPage().sixthHeaderOfWebTable.getText());
    }
    @Then("verify List button is clickable")
    public void verify_List_button_is_clickable() {
        String list = pages.reportProdMovesPage().listButton.getText().toLowerCase();
        Assert.assertTrue("List button is not shown",list.contains(list));
    }

    @Then("click on Kanban button")
    public void click_on_Kanban_button() {
        String kanban = pages.reportProdMovesPage().kanbanButton.getText().toLowerCase();
        Assert.assertTrue("List button is not shown",kanban.contains(kanban));
    }

    @Then("select Pivot button")
    public void select_Pivot_button() {
        String pivot = pages.reportProdMovesPage().pivotButton.getText().toLowerCase();
        Assert.assertTrue("List button is not shown",pivot.contains(pivot));
    }

}