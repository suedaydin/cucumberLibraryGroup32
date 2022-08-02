package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage {

    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class='nav-link']")
    public List<WebElement> numberOfModules;

   @FindBy (id="navbarDropdown")
    public WebElement userNameLink;

    public void assertNumberOfModulesLibrarian(String message, int numberOfModulesLibrarian) {
        Assert.assertEquals(message, numberOfModulesLibrarian,numberOfModules.size());
    }

    public void assertNumberOfModulesStudent(int numberOfModulesStudent) {
        Assert.assertEquals("Number of modules for student verification failed!", numberOfModulesStudent, numberOfModules.size());
    }

}