package com.ceallo.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_StepDef {


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("loginPage");
    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Enter username and password");
    }
    @Then("user can login")
    public void user_can_login() {
        System.out.println("user logged in");
    }

}
