package com.ceallo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement profileStatusLogo;

}
