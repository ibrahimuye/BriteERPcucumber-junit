package com.inventory.pages;

import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

//    this class is created as superClass of the other pages, the Webelements in the header and  footer and company logo have been created here
//    so that all these Webelments can be used from other pages

    public  HomePage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Inventory")
    public WebElement inventoryLink;

    @FindBy(className = "oe_topbar_name")
    public WebElement visibleUserName;

    @FindBy(linkText = "Log out")
    public WebElement logoutLink;




}