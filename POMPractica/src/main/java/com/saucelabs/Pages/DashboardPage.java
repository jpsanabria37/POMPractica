package com.saucelabs.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    By lbl_products = By.xpath("//span[text() = \"Products\"]");

    public String lblProducts(){
        return getDriver().findElement(lbl_products).getText().replace(" ", "");
    }
}
