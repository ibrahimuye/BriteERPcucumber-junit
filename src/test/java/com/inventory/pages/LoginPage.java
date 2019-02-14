package com.inventory.pages;

import com.inventory.utilities.ConfigurationReader;
import com.inventory.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "BriteErpDemo")
    public WebElement demoLink;

    @FindBy(id = "login")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement logInButton;

    @FindBy(linkText = "Sign in")
    public WebElement signInLink;

    @FindBy(tagName = "html")
    public WebElement pageText;

    public void loginFunction () {

        if(!pageText.getText().contains("Sign in")){demoLink.click();
            userNameBox.sendKeys(ConfigurationReader.getProperty("username"));
            passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
            logInButton.click();}
        else {signInLink.click();
            userNameBox.sendKeys(ConfigurationReader.getProperty("username"));
            passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
            logInButton.click();

        }



    }







}