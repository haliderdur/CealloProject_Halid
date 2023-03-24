package com.ceallo.step_defs;

import com.ceallo.pages.HomePage;
import com.ceallo.pages.LoginPage;
import com.ceallo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get("https://qa.ceallo.com/index.php/apps/files/?dir=/&fileid=2907");
    }

    @When("user clicks profile status icon")
    public void user_clicks_profile_status_icon() {
        homePage.profileStatusLogo.click();
    }

    @When("user clicks log out button")
    public void user_clicks_log_out_button() {
        homePage.logoutButton.click();
    }

    @Then("user reaches login page")
    public void user_reaches_login_page() {
        Assert.assertTrue("Test PASSED!", loginPage.cealloLogo.isDisplayed());
    }

}
