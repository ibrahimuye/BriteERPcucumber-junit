package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends HomePage {

    public InventoryPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Scrap")
    public WebElement scrapLink;

    @FindBy(linkText = "Products")
    public WebElement productsLink;

    @FindBy(partialLinkText = "Inventory Adjustments")
    public WebElement invAdjustmentsLink;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createProductsButton;

    @FindBy(linkText = "Product Moves")
    public WebElement productMovesLink;





}