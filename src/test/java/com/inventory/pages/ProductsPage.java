package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends HomePage {

    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Products Page elements
    @FindBy(tagName = "html")
    public WebElement productsText;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createProductsButton;
    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement productSearchBox;
    @FindBy(xpath = "//div[@class='oe_kanban_details']")
    public WebElement productFoundProduct;

    @FindBy(xpath = "( //table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr[1]//td[4])[1]")
    public WebElement searchResult;
   // @FindBy(xpath = "//div[@class='o_notification_content']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/strong/span")
    public WebElement productNotificationMessage;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement crtCategoryCancelButton;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement productsEditButton;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/ul[1]/li[2]")
    public WebElement opticalMouseOnHand;


//


    //span[.='Pencil12345']
    //Products/New form elements

    //@FindBy(xpath = "//input[starts-with(@id,'o_field_input_')]")
    //o_field_char o_field_widget o_input o_required_modifier
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement productsNewProductName;
    @FindBy(xpath = "//select[@class='o_input o_field_widget o_required_modifier']")
    public WebElement productsNewProductType;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement productsNewCategory;
    @FindBy(xpath = "//*[.='Product Template created']")
    public WebElement productCreated;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement productsNewSave;
    @FindBy(xpath = "(//input[@class='o_input'])[1]")
    public WebElement productsNewSalesPrice;


    //
    public Select productsNewProductTypeList() {
        return new Select(productsNewProductType);
    }

    // i didnt use this. cuz there was no list for category. element directly located.
    public Select productsNewCategoryList() {
        return new Select(productsNewCategory);
    }


}