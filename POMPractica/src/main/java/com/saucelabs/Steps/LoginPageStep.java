package com.saucelabs.Steps;

import com.saucelabs.Pages.DashboardPage;
import com.saucelabs.Pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;

public class LoginPageStep {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Step
    public void open(){
        loginPage.open();
    }

    @Step
    public void enterCredentialsLogin(){
        loginPage.enterCredentialsLogin("standard_user", "secret_sauce");
    }

    @Step
    public void clickButtonLogin(){
        loginPage.clickButtonLogin();
    }

    @Step
    public void ValidateLblProduct(String products_validate){
        String lbl_product = dashboardPage.lblProducts();
        assertEquals(products_validate, lbl_product );
    }
}
