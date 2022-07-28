package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
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

    @And("verify that the title is {string} and verify the URL is {string}")
    public void verifyThatTheTitleIsAndVerifyTheURLIs(String expectedTitle, String expectedURL) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertTrue("Title verification failed!", expectedTitle.equals(driver.getTitle()));

        wait.until(ExpectedConditions.urlToBe(expectedURL));
        Assert.assertTrue("URL verification failed!", expectedURL.equals(driver.getCurrentUrl()));
    }



    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);

    }

    @And("user clicks sign in button")
    public void userClicksSignInButton() {
        loginPage.signInBtn.click();
    }

    @Then("verify that there are {int} or {int} modules on the page")
    public void verifyThatThereAreOrModulesOnThePage(int numberOfModulesLibrarian, int numberOfModulesStudent) {
        BrowserUtils.waitForVisibility(usersPage.userNameLink,10);
        if(usersPage.userNameLink.getText().contains("Librarian")){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
            wait.until(ExpectedConditions.visibilityOfAllElements(usersPage.numberOfModules));
            Assert.assertEquals("Number of modules for librarian verification failed!",numberOfModulesLibrarian, usersPage.numberOfModules.size());
       }else{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
            wait.until(ExpectedConditions.visibilityOfAllElements(usersPage.numberOfModules));
            Assert.assertEquals("Number of modules for student verification failed!",numberOfModulesStudent, usersPage.numberOfModules.size());
        }
    }


    @When("user enters invalid email {string} or password {string}")
    public void userEntersInvalidEmailOrPassword(String invalidEmail, String invalidPassword) {
        loginPage.emailInput.sendKeys(invalidEmail);
        loginPage.passwordInput.sendKeys(invalidPassword);
    }

    @Then("user sees the error message {string}")
    public void userSeesTheErrorMessage(String expectedErrorMessage) {
        Assert.assertEquals("Message verification failed!", expectedErrorMessage, loginPage.actualErrorMessage.getText());
    }
}
