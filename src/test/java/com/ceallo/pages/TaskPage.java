package com.ceallo.pages;

import com.ceallo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaskPage extends BasePage {

    public TaskPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement newListInputBox;

    @FindBy(xpath = "//input[@id='newListInput']/..//input[@title='Save']")
    public WebElement newListSaveButton;

    @FindBy(xpath = "(//input[@title='Cancel'])[3]")
    public WebElement newListCancelButton;

    @FindBy(id = "newListInput")
    public WebElement addListInputBox;

    @FindBy(xpath = "(//label[contains(@for,'toggleCompleted')])[1]")
    public WebElement completedCheckBox;

    @FindBy(xpath = "//ol/li[1]//button[contains(@class,'inline task-star')]")
    public WebElement starIcon;

    @FindBy(id = "collection_completed")
    public WebElement completedTab;

    @FindBy(xpath = "//span[@title='Current']/../..//div[@class='app-navigation-entry__counter']")
    public WebElement currentTabCounter;

    @FindBy(xpath = "//span[@title='All']/../..//div[@class='app-navigation-entry__counter']")
    public WebElement allTabCounter;

    @FindBy(xpath = "//span[.='1 Completed Task']")
    public WebElement completedTasksDynamicList;

    @FindBy(id = "collection_starred")
    public WebElement importantTab;

    @FindBy(id = "collection_current")
    public WebElement currentTab;


    @FindBy(className = "app-navigation__list")
    public List<WebElement> tabList;

    @FindBy(xpath = "//li[@calendar-id='newlist1']")
    public WebElement createdlistTab;

    @FindBy(id = "target")
    public WebElement addTaskToListInputBox;

    @FindBy(xpath = "//div[@class='task-list']")
    public List<WebElement> taskOrderedList;

    @FindBy(xpath = "//div[@class='title']")
    public WebElement newTaskTitle;

    @FindBy(xpath = "//div[@class='title']")
    public WebElement completedTaskTitle;

    @FindBy(xpath = "//div[@class='title']")
    public WebElement importantTaskTitle;




}
