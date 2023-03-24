package com.ceallo.pages;

import com.ceallo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement profileStatusLogo;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "(//a[@aria-label='Tasks'])[1]")
    public WebElement tasksIcon;

    public void logout(){
        this.profileStatusLogo.click();
        this.logoutButton.click();
    }

}
