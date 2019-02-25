package com.inventory.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;

public class ScrapWebTableTestStepDefs extends BrowserUtils {
    Pages pages = new Pages();


    @Then("user verifies that the scrap web table is sorted according to reference column in the descending order")
    public void user_verifies_that_the_scrap_web_table_is_sorted_according_to_column_in_the_descending_order() {
        List<String> refColumn = getElementsText(Driver.getDriver().findElements
                (By.xpath("//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[2]")));
        List<String > sortedRefColumn =getElementsText(Driver.getDriver().findElements
                (By.xpath("//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[2]")));
        Collections.sort(sortedRefColumn,Collections.reverseOrder());
        Assert.assertEquals( "Reference column is NOT sorted in descending",sortedRefColumn, refColumn);

    }


    @Then("user verifies that the scrap web table can be sorted according to {string} column in the ascending order")
    public void user_verifies_that_the_scrap_web_table_can_be_sorted_according_to_column_in_the_ascending_order(String string) {

        String strXpath=null;
        switch (string){
            case "Create Date" :
                pages.scrapPage().createDateOnWebTable.click();
                wait(4);
                strXpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[3]";
                break;
            case "Product" :
                pages.scrapPage().productOnWebTable.click();
                wait(4);
                strXpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[4]";
                break;
            case "Quantity" :
                pages.scrapPage().quantityOnWebTable.click();
                wait(4);
                strXpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[5]";
                break;
            case "Status" :
                pages.scrapPage().statusOnWebTable.click();
                wait(4);
                strXpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[6]";
                break;
        }

        List<String > columnInProcess = getElementsText(By.xpath(strXpath));
        List<String > sortedColumnInProcess =getElementsText(By.xpath(strXpath));
        Collections.sort(sortedColumnInProcess);
        String space= sortedColumnInProcess.get(0);
        sortedColumnInProcess.remove(0);
        sortedColumnInProcess.add(space);
        System.out.println(columnInProcess);
        System.out.println(sortedColumnInProcess);
        Assert.assertTrue("column is not sorted",sortedColumnInProcess.equals(columnInProcess));
        }
}
