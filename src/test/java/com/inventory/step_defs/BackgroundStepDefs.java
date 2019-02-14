package com.inventory.step_defs;
import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.ConfigurationReader;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BackgroundStepDefs extends BrowserUtils {

    Pages pages= new Pages();

    @Given("manager is on the login page")
    public void manager_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the manager logs in using {string} and {string}")
    public void the_manager_logs_in_using_and(String string, String string2) {
        pages.loginPage().loginFunction();
    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Odoo() {
//        waitForPageToLoad(5);//interestingly with this wait the page title comes out missing
        wait(4);
        Assert.assertEquals("page title is wrong","#Inbox - Odoo", Driver.getDriver().getTitle());
    }

    @When("the manager clicks on the inventory link")
    public void the_manager_clicks_on_the_inventory_link() {
        pages.homePage().inventoryLink.click();
    }

    @Then("the title should be Inventory")
    public void the_title_should_be_Inventory() {
//        waitForPageToLoad(5);//interestingly with this wait the page title comes out missing
        wait(4);
        Assert.assertEquals("page title is wrong", "Inventory - Odoo", Driver.getDriver().getTitle());
    }

    @Then("the user is already on the inventory page")
    public void that_the_user_is_already_on_the_inventory_page() {
        Assert.assertEquals("url is wrog",Driver.getDriver().getCurrentUrl(), "http://52.39.162.23/web?#view_type=kanban&model=stock.picking.type&menu_id=366&action=488");
    }
}
