package com.ceallo.step_defs;


import com.ceallo.pages.HomePage;
import com.ceallo.pages.LoginPage;
import com.ceallo.pages.TaskPage;
import com.ceallo.utils.ConfigReader;
import com.ceallo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TasksModule_StepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    TaskPage taskPage = new TaskPage();

    @Given("user logged in and on tasks page")
    public void user_logged_in_and_on_tasks_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        loginPage.login();
        homePage.tasksIcon.click();
    }

    @When("user clicks on AddList button and type list name")
    public void user_clicks_on_add_list_button_and_type_list_name() {
        taskPage.addListButton.click();
        String listName = "newList1";
        taskPage.addListInputBox.sendKeys(listName);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        taskPage.newListSaveButton.click();
    }

    @Then("list name should be displayed as tab")
    public void list_name_should_be_displayed_as_tab() {
        Assert.assertTrue(taskPage.createdlistTab.isDisplayed());
    }

    @When("user clicks on newly created list tab")
    public void user_clicks_on_newly_created_list_tab() {
        taskPage.createdlistTab.click();
    }

    @When("user types taskname and hits enter")
    public void user_types_taskname_and_hits_enter() {
        taskPage.addTaskToListInputBox.sendKeys("newTask1" + Keys.ENTER);
    }

    @Then("new task created")
    public void new_task_created() {
        Assert.assertTrue(taskPage.newTaskTitle.isDisplayed());
    }

    @When("user clicks on tasklist tab")
    public void user_clicks_on_tasklist_tab() {
        taskPage.createdlistTab.click();
    }

    @And("user clicks on task checkbox")
    public void user_clicks_on_task_checkbox() {
        taskPage.completedCheckBox.click();
    }

    @Then("task should be added in completed tab")
    public void task_should_be_added_in_completed_tab() {
        taskPage.completedTab.click();

        Assert.assertEquals(taskPage.completedTaskTitle.getText(), taskPage.newTaskTitle.getText());
    }

    @When("user clicks on star icon")
    public void user_clicks_on_star_icon() {
        taskPage.starIcon.click();
    }

    @Then("task should be added in important tab")
    public void task_should_be_added_in_important_tab() {
        taskPage.importantTab.click();

        Assert.assertEquals(taskPage.importantTaskTitle.getText(), taskPage.newTaskTitle.getText());
    }

    @Then("user can see number of uncompleted task amount on current tab")
    public void user_can_see_number_of_uncompleted_task_amount_on_current_tab() {
        Assert.assertTrue(taskPage.currentTabCounter.getText().equals(taskPage.allTabCounter.getText()));
    }


}
