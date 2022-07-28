package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement signInBtn;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement actualErrorMessage;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}