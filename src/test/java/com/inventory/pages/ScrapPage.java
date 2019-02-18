package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrapPage extends HomePage{
    public ScrapPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //    web table headers
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[2]")
    public WebElement firstHeaderOfWebTable;
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[2]")
    public WebElement referenceOnWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[3]")
    public WebElement secondHeaderOfWebTable;
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[3]")
    public WebElement createDateOnWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[4]")
    public WebElement thirdHeaderOfWebTable;
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[4]")
    public WebElement productOnWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[5]")
    public WebElement fourthHeaderOfWebTable;
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[5]")
    public WebElement quantityOnWebTable;


    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[6]")
    public WebElement fifthHeaderOfWebTable;
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[6]")
    public WebElement statusOnWebTable;

//    buttons

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createScrapOrderButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class = 'btn btn-sm btn-default oe_highlight']")
    public WebElement validateButton;

    @FindBy(xpath = "//div[@class='o_cp_sidebar']")
    public WebElement actionButton;

    @FindBy(linkText = "Export")
    public WebElement exportButton;

    @FindBy(xpath = "(//input[@name='o_import_compat_name'])[2]")
    public WebElement exportAllRadioButton;

    @FindBy(xpath = "//input[@value='xls']")
    public WebElement excelRadioButton;

    @FindBy(xpath = "//button [@class='btn btn-sm btn-primary']")
    public WebElement exportToFileButton;

    @FindBy(xpath = "(//span [@class='o_tree_column'])[4]")
    public WebElement lastUpdatedByButton;

    @FindBy(xpath = "(//span [@class='o_tree_column'])[12]")
    public WebElement statusButton;

    @FindBy(xpath = "(//span [@class='o_tree_column o_required'])[2]")
    public WebElement productButton;

    @FindBy(xpath = "(//span [@class='o_tree_column o_required'])[3]")
    public WebElement quantityButton;

    @FindBy(xpath = "(//span [@class='o_tree_column o_required'])[5]")
    public WebElement unitOfMeasureButton;

    @FindBy(xpath = "//button [@class='btn btn-sm btn-default o_add_field']")
    public WebElement addButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closeExportPage;

    @FindBy(xpath = "//input[@name='o_import_compat_name']")
    public WebElement importCompatableExport;

    @FindBy(xpath = "//input[@value='csv']")
    public WebElement CSVRadioButton;

    @FindBy (xpath = "//button[@ class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement importFilePathBox;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFileButton;







    @FindBy(tagName = "html")
    public WebElement pageText;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement scrapOrdersText;


    @FindBy(xpath = "((//table[@class='o_group o_inner_group o_group_col_6'])[1]//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement productBox;

    @FindBy(xpath= "//input[@class='o_field_float o_field_number o_field_widget o_input o_required_modifier']")
    public WebElement quantityBox;

    @FindBy(partialLinkText = "Search More")
    public WebElement searchMore;

    @FindBy(xpath = "/html/body/ul/li[4]/a")
    public WebElement graphicsCard;

    @FindBy(xpath = "//td[.='Mouse, Optical']")
    public WebElement mouseOptical;

    @FindBy(className= "o_searchview_input")
    public WebElement searchBar;

    @FindBy(xpath = "( //table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr[1]//td[4])[1]")
    public WebElement searchResult;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[1]")
    public WebElement selectAllEntries;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr//td[2]")
    public WebElement referenceCoulumn;






















}