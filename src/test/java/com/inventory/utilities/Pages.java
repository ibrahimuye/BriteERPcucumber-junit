package com.inventory.utilities;

import com.inventory.pages.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pages {
    private LoginPage loginPage;
    private HomePage homePage;
    private InventoryPage inventoryPage;
    private ScrapPage scrapPage;
    private ProductsPage productsPage;
    private InvAdjustmentsPage invAdjustmentsPage;
    private InvAdjustmentsItemPage invAdjustmentsItemPage;
    private ReportProdMovesPage reportProdMovesPage;



    public ProductsPage productsPage() {
        if (productsPage == null) {
            productsPage = new ProductsPage();
        }
        return productsPage;
    }


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public InventoryPage inventoryPage() {
        if (inventoryPage == null) {
            inventoryPage = new InventoryPage();
        }
        return inventoryPage;
    }


    public ScrapPage scrapPage() {
        if (scrapPage == null) {
            scrapPage = new ScrapPage();
        }
        return scrapPage;
    }


    public Select selectFunction(WebElement element) {
        Select select = new Select(element);

        return select;
    }

    public InvAdjustmentsPage invAdjustmentsPage() {
        if (invAdjustmentsPage == null) {
            invAdjustmentsPage = new InvAdjustmentsPage();
        }
        return invAdjustmentsPage;
    }

    public InvAdjustmentsItemPage invAdjustmentsItemPage() {
        if (invAdjustmentsItemPage == null) {
            invAdjustmentsItemPage = new InvAdjustmentsItemPage();
        }
        return invAdjustmentsItemPage;
    }

    public ReportProdMovesPage reportProdMovesPage() {
        if (reportProdMovesPage == null) {
            reportProdMovesPage = new ReportProdMovesPage();
        }
        return reportProdMovesPage;
    }
}