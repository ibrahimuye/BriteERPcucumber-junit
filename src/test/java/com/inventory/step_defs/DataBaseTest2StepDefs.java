package com.inventory.step_defs;

import com.inventory.utilities.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

import static com.inventory.utilities.BrowserUtils.waitForClickablility;

public class DataBaseTest2StepDefs {

    Pages pages = new Pages();
    String file = "./src/test/resources/test_data/test_data.xlsx";
    String sheet = "Sayfa1";
    ExcelUtil mydata = new ExcelUtil(file, sheet);
    List<Map<String, String>> row = mydata.getDataList();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user types the name of the product from Excel file and validates in DB")
    public void user_types_the_name_of_the_product_from_Excel_file_and_validates_in_DB() throws InterruptedException {
        for (int i = 1; i <mydata.rowCount(); i++) {
            //data from excel file
//            System.out.println(mydata.rowCount());
            String product = mydata.getCellData(i,0);
            //typing data from excel at UI
            waitForClickablility(pages.productsPage().productsNewProductType,3);
            actions.moveToElement(pages.productsPage().productsNewProductType).sendKeys(product).perform();
            // saving data at UI
            pages.productsPage().productsNewSave.click();
            BrowserUtils.wait(2);
            String sql = "SELECT name FROM product_template ORDER BY create_date DESC;";
            // reading the product name from DB
            String productDB = DatabaseUtility.getCellValue(sql).toString();
//            System.out.println(productDB);
            Assert.assertEquals("DB and UI values are not same",product,productDB);
            pages.inventoryPage().productsLink.click();
            BrowserUtils.wait(2);
            waitForClickablility(pages.productsPage().createProductsButton,6).click();
            BrowserUtils.wait(2);
        }




    }


}
