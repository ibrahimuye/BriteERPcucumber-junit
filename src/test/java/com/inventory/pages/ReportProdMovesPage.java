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
    public WebElement productMovessText;

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

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th[8]")
    public WebElement seventhHeaderOfWebTable;



}