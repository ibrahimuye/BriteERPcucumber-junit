package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvAdjustmentsPage extends HomePage {

    public InvAdjustmentsPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".breadcrumb")
    public WebElement inventoryAdjustmentTitle;

    @FindBy(css = ".btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement createButton;

    @FindBy(css = ".btn.btn-sm.btn-default.o_button_import")
    public WebElement importButton;

    @FindBy(className ="o_searchview_input")
    public WebElement searchBox;

    @FindBy(className = "o_facet_values")
    public WebElement searchDefaultValue;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement filterDropdown;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]")
    public WebElement groupByDropdown;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[5]")
    public WebElement favoritesDropdown;

    @FindBy(xpath = "//li[@class='o_save_search o_closed_menu']")
    public WebElement saveCurrentSearchDropdown;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement saveCurrentSearchTextBox;

    @FindBy(xpath = "//li[@class='o-searchview-custom-private selected']")
    public WebElement savedSearchItem;

    @FindBy(xpath = "//li[@class='o_save_search o_closed_menu']")
    public WebElement saveDropdownButton;

    @FindBy(xpath = "//span[@class='fa fa-trash-o o-remove-filter']")
    public WebElement removeFilterIcon;

    @FindBy(xpath = " //div[@class='o_dialog_warning modal-body']")
    public WebElement globalFilterDeleteErrorMessage;



    @FindBy(css = ".btn.btn-icon.fa.fa-lg.fa-list-ul.o_cp_switch_list.active")
    public WebElement listViewButton;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban']")
    public WebElement kanbanViewButton;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[2]")
    public WebElement inventoryReferenceHeader;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[3]")
    public WebElement inventoryDateHeader;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[4]")
    public WebElement statusHeader;

    @FindBy(css = ".o_kanban_view.o_kanban_mobile.o_kanban_ungrouped")
    public WebElement kanbanViewDisplay;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement inventoryTransferItem;

    @FindBy(tagName = "html")
    public WebElement SearchInventoryReference;

    @FindBy(tagName = "html")
    public WebElement SearchInventoryProduct;

    @FindBy(xpath = "//td[@class='o_data_cell o_readonly_modifier o_required_modifier']")
    public WebElement FirstLaptopItem;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement forDeleteTestFinalItem;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement forValidationTestItem;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement forStatusTestItem;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement advancedSearchButton;



}