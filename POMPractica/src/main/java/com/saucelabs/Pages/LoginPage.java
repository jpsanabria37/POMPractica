package com.saucelabs.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    By text_username = By.id("user-name");
    By text_password = By.id("password");
    By btn_login = By.id("login-button");

    public void enterCredentialsLogin(String username, String password ){
        getDriver().findElement(text_username).sendKeys(username);
        getDriver().findElement(text_password).sendKeys(password);
    }

    public void clickButtonLogin(){
        getDriver().findElement(btn_login).click();
    }


}
