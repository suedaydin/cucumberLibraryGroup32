package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B26G32_95_LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();
    WebDriver driver = Driver.getDriver();

    @Given("user is on the loginPage")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("qa2_url"));
    }
    @Given("verify that the title is {string}")
    public void verify_that_the_title_is(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertTrue("Title verification failed!", expectedTitle.equals(driver.getTitle()));
    }
    @When("librarian enters valid {string} and {string}")
    public void librarian_enters_valid_and(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("librarian clicks sign in button")
    public void librarian_clicks_sign_in_button() {
        loginPage.signInBtn.click();
    }
    @Then("verify that there are {int} modules on the page")
    public void verify_that_there_are_modules_on_the_page(Integer numberOfModules) {
        System.out.println("usersPage.librarianModules.size() = " + usersPage.librarianModules.size());
        Assert.assertEquals("Number of modules verification failed!", (int)numberOfModules, usersPage.librarianModules.size());
    }

}
