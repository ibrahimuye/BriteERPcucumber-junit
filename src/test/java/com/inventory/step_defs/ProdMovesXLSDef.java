package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class ProdMovesXLSDef extends BrowserUtils {
    Pages pages = new Pages();
    Actions actions = new Actions(Driver.getDriver());

    @When("user selects  {string}")
    public void user_selects(String string) {
        switch (string) {
            case "ImportCompatableExport":
                pages.reportProdMovesPage().ImportCompExport.click();
                break;
            case "Export all Data":
                pages.reportProdMovesPage().ExportAllDataBtn.click();
                break;
        }
        System.out.println(string);
    }

    @When("Selects {string} type Excel or CSV")
    public void selects_type_Excel_or_CSV(String string) {
        switch (string) {
            case "CSV":
                pages.scrapPage().CSVRadioButton.click();
                break;
            case "Excel":
                pages.scrapPage().excelRadioButton.click();
                break;
        }
    }

    @Then("in Available fields selects several lines and adds them: Consume Line, Date, Display name")
    public void in_Available_fields_selects_several_lines_and_adds_them_Consume_Line_Date_Display_name() {
        pages.reportProdMovesPage().ConsumeLineField.click();
        pages.reportProdMovesPage().addButton.click();
        pages.reportProdMovesPage().DateField.click();
        pages.reportProdMovesPage().addButton.click();
        pages.reportProdMovesPage().DisplayNameField.click();
        pages.reportProdMovesPage().addButton.click();

    }


    @Then("Runs the report by clicking on Export to File button")
    public void runs_the_report_by_clicking_on_Export_to_File_button() {
        pages.reportProdMovesPage().exportToFile.click();
        wait(6);
        pages.reportProdMovesPage().CloseBtn.click();

    }

//    @Then("user closes the window")
//    public void user_closes_the_window(io.cucumber.datatable.DataTable dataTable) {
//
//    }
}
