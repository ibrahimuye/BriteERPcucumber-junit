package com.inventory.utilities.step_defs;

import com.inventory.utilities.BrowserUtils;
import com.inventory.utilities.Driver;
import com.inventory.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import static com.inventory.utilities.Driver.getDriver;

public class InvAdjAddFavoriteSearchFilterTestStepDefs extends BrowserUtils {

    Pages pages = new Pages();

    @When("the manager clicks on Favorites dropdown menu")
    public void the_manager_clicks_on_Favorites_dropdown_menu() {
        pages.invAdjustmentsPage().favoritesDropdown.click();
    }

    @When("the manager clicks on Save current search from the dropdown list")
    public void the_manager_clicks_on_Save_current_search_from_the_dropdown_list() {
        pages.invAdjustmentsPage().saveCurrentSearchDropdown.click();
    }

    @When("the manager clears Save Current Search Text Box")
    public void the_manager_clears_Save_Current_Search_Text_Box() {
        pages.invAdjustmentsPage().saveCurrentSearchTextBox.clear();
    }

    @When("the manager enters laptop in the Save Current Search Text Box")
    public void the_manager_enters_laptop_in_the_Save_Current_Search_Text_Box() {
        pages.invAdjustmentsPage().saveCurrentSearchTextBox.sendKeys("laptop" + Keys.ENTER);
    }

    @Then("verify laptop is saved as favorite search item")
    public void verify_laptop_is_saved_as_favorite_search_item() {
        Assert.assertTrue("saved search filter can not be found", pages.invAdjustmentsPage().savedSearchItem.getText().contains("laptop"));
    }

    @Then("delete saved laptop favorite search item")
    public void delete_saved_laptop_favorite_search_item() {
        pages.invAdjustmentsPage().removeFilterIcon.click();
    }

    @Then("the manager clicks on OK button")
    public void the_manager_clicks_on_OK_button() {

    Alert alert = Driver.getDriver().switchTo().alert();
    alert.accept();
    }
}
