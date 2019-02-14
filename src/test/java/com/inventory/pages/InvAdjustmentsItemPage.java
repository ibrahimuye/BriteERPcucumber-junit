package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvAdjustmentsItemPage extends HomePage {

    public InvAdjustmentsItemPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_create']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement inventoryReferenceNameBox;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement inventoryReferenceNameHeader;

    @FindBy(xpath = "//input[@checked='true']")
    public WebElement allProductsRadioButton;

    @FindBy(xpath = "//input[@class='o_datepicker_input o_input']")
    public WebElement forceAccountingDateBox;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[3]")
    public WebElement actionButton;

    @FindBy(linkText = "Delete")
    public WebElement deleteButton;

    @FindBy(linkText = "Duplicate")
    public WebElement deleteOkButton;

    @FindBy(xpath = "(//a[@data-index='1'])[1]")
    public WebElement duplicateButton;

    @FindBy(xpath = "//button[@class='btn btn-sm o_arrow_button btn-primary disabled']")
    public WebElement draftStatusTab;

    @FindBy(xpath = "//button[@class='btn btn-sm o_arrow_button btn-primary disabled']")
    public WebElement inProgressStatusTab;

    @FindBy(xpath = "//button[@class='btn btn-sm o_arrow_button btn-primary disabled']")
    public WebElement validatedStatusTab;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
    public WebElement validateInventoryButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
    public WebElement startInventoryButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement cancelInventoryButton;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement validationDeleteErrorMessage;

    @FindBy(xpath = "//div[@class='o_cp_searchview']")
    public WebElement newInvAdjHeader;

    @FindBy(xpath = "(//input[@class='o_radio_input'])[4]")
    public WebElement selectProductsManuallyRadioButton;

}