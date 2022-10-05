package com.saucelabs.stepsdefinitions;

import com.saucelabs.Steps.LoginPageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    LoginPageStep login;

    @Given("I find myself on the swaglabs home page.")
    public void iFindMyselfOnTheSwaglabsHomePage() {
        login.open();
    }

    @When("entering the correct credentials")
    public void enteringTheCorrectCredentials() {
        login.enterCredentialsLogin();
        login.clickButtonLogin();
    }

    @Then("I must be able to see the products")
    public void iMustBeAbleToSeeTheProducts() {
        login.ValidateLblProduct("PRODUCTS");
    }
}
