package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportProdMovesPage extends HomePage {
    public ReportProdMovesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName="html")
    public WebElement productMovesText;
    // headers
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[2]")
    public WebElement firstHeaderOfWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[3]")
    public WebElement secondHeaderOfWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[4]")
    public WebElement thirdHeaderOfWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[5]")
    public WebElement fourthHeaderOfWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[6]")
    public WebElement fifthHeaderOfWebTable;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[7]")
    public WebElement sixthHeaderOfWebTable;

    @FindBy(xpath = "//th[8][@class='o_column_sortable']")
    public WebElement seventhHeaderOfWebTable;

    //table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[8]
//buttons

    @FindBy(xpath = "//div[@class='o_cp_sidebar']")
    public  WebElement actionButton;

    @FindBy(linkText = "Export")
    public WebElement export;

    @FindBy(xpath = "//div[@class='modal-header']")
    public WebElement ExportDataPage;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[1]")
    public WebElement checkbox;

    @FindBy (xpath = "//button[@class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list active']")
    public WebElement listButton ;

    @FindBy (xpath = "//button[@class='btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//button[@class='btn btn-icon fa fa-lg fa-table o_cp_switch_pivot']")
    public WebElement pivotButton;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement closeExportData;

    //Export Data window
    @FindBy (linkText = "Import-Compatible Export")
    public WebElement ImportCompExport;

    @FindBy(linkText = "Export all Data" )
    public WebElement ExportAllDataBtn;

    @FindBy (xpath = "//div[@class='o_export_format']")
    public WebElement ExportFormata;

    @FindBy (linkText = "xls")
    public WebElement xlsBtn;

    @FindBy(xpath = "(//span[@class='o_tree_column'])[1]")
    public WebElement ConsumeLineField;

    @FindBy(xpath = "(//span[@class='o_tree_column'])[4]")
    public WebElement DateField;

    @FindBy(xpath = "(//span[@class='o_tree_column'])[5]")
    public WebElement DisplayNameField;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_add_field']")
    public WebElement addButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement CloseBtn;

    @FindBy (linkText = "Export To File")
    public WebElement exportToFile;



    //inventory valuation page

    @FindBy (id = "/web#menu_id=474&action=637")
    public WebElement InventoryValuation;

    @FindBy(id ="radio3584_0")
    public WebElement CurrentInv;

    @FindBy(xpath = "//button[@class ='btn btn-sm btn-primary']")
    public WebElement RetrieveInvVal;

    @FindBy(linkText = "Product Valuation")
    public WebElement ProductValuationMain;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createBtn;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier'")
    public WebElement ProductNameInput;

    @FindBy (tagName = "service")
    public WebElement Servicedropdown;

    @FindBy (id = "o_field_input_4606")
    public WebElement InternalRef;

    @FindBy(id = "o_field_input_4607")
    public WebElement Barcode;

    @FindBy(id = "o_field_input_4916")
    public WebElement SalesPrice;

    @FindBy(id="o_field_input_4920")
    public WebElement Cost;

    @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[3]")
    public WebElement SquareBtn;

    @FindBy(id="o_field_input_5029")
    public WebElement CategoryName;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement SaveBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement SaveBtn2;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement NewItemSheet;

}