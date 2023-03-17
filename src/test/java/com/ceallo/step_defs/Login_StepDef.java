package com.ceallo.step_defs;

import com.ceallo.pages.LoginPage;
import com.ceallo.pages.MainPage;
import com.ceallo.utils.ConfigReader;
import com.ceallo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.username.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
    }

    @Then("user can login")
    public void user_can_login() {
        Assert.assertTrue("Test PASSED!", mainPage.profileStatusLogo.isDisplayed());
    }

}
