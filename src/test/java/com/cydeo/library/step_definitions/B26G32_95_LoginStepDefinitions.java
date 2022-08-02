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

    //1. Declaring login page object
    LoginPage loginPage = new LoginPage();

    //2.Declaring users page object
    UsersPage usersPage = new UsersPage();

    //3.Declaring driver object
    WebDriver driver = Driver.getDriver();

    //4.Declaring explicit wait object
    WebDriverWait wait;

    /**
     * Scenario Outline: As a user, I should be able to login to LibraryCT
     *     Given user is on the loginPage
     *     And verify that the title is "Login - Library" and verify the URL is "https://library2.cydeo.com/login.html"
     *     When user enters valid "<email>" and "<password>"
     *     And user clicks sign in button
     *     Then verify that there are 3 modules for librarian user or 2 modules for student user on the page
     */
    @Given("user is on the loginPage")
    public void user_is_on_the_login_page() {

        //Opening browser and going to Login page using qa environment url from configuration properties file
        driver.get(ConfigurationReader.getProperty("qa2_url"));
    }

    @And("verify that the title is {string} and verify the URL is {string}")
    public void verifyThatTheTitleIsAndVerifyTheURLIs(String expectedTitle, String expectedURL) {

        //1. Declaring and using explicit wait object with condition for title to be as expected
        wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        //2. Using utility method to assert title is "Login - Library"
        BrowserUtils.verifyTitle(driver, expectedTitle);

        //3. Declaring and using explicit wait object with condition for URL to be as expected
        wait.until(ExpectedConditions.urlToBe(expectedURL));

        //4. Using utility method to assert URL is "https://library2.cydeo.com/login.html"
        BrowserUtils.verifyURLContains(expectedURL);
    }

    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String email, String password) {

        //1. Entering provided user's email in email input box
        loginPage.emailInput.sendKeys(email);

        //2. Entering provided user's password in password input box
        loginPage.passwordInput.sendKeys(password);
    }

    @And("user clicks sign in button")
    public void userClicksSignInButton() {
        //Clicking sign in button on login page
        loginPage.signInBtn.click();
    }

    @Then("verify that there are {int} modules for librarian user or {int} modules for student user on the page")
    public void verifyThatThereAreModulesForLibrarianUserOrModulesForStudentUserOnThePage(int numberOfModulesLibrarian, int numberOfModulesStudent) {

        //1. Using utility method with explicit wait  with condition to wait for visibility of the username element on Users page
        BrowserUtils.waitForVisibility(usersPage.userNameLink,10);

        //2. If-else statement to check the type of logged user
        //   If condition - checking if user logged as a Librarian
        if(usersPage.userNameLink.getText().contains("Librarian")){

            //3. Declaring and using explicit wait object with condition visibilityOfAllElements for List of web elements (number of modules)
            wait = new WebDriverWait(Driver.getDriver(), 15);
            wait.until(ExpectedConditions.visibilityOfAllElements(usersPage.numberOfModules));

            //4. If user's name on top right corner of the page is containing Librarian then verify
            // number of modules is as expected by using assertion method from POM UsersPage
            usersPage.assertNumberOfModulesLibrarian("Number of modules for librarian verification failed!", numberOfModulesLibrarian);
            //5. else - if user logged as a student
        }else{
            //6. Declaring and using explicit wait object with condition visibilityOfAllElements for List of web elements (number of modules)
            wait = new WebDriverWait(Driver.getDriver(), 15);
            wait.until(ExpectedConditions.visibilityOfAllElements(usersPage.numberOfModules));

            //7. If user's name on top right corner of the page is containing Student then verify
            // that number of modules is as expected by using assertion method from POM UsersPage
            usersPage.assertNumberOfModulesStudent(numberOfModulesStudent);
        }
    }


    /**
     * Scenario: Login with invalid credential
     *     Given user is on the loginPage
     *     When user enters invalid email "makeup@cydeo.com" or password "makeup123"
     *     And user clicks sign in button
     *     Then user sees the error message "Sorry, Wrong Email or Password"
     *
     */

    @When("user enters invalid email {string} or password {string}")
    public void userEntersInvalidEmailOrPassword(String invalidEmail, String invalidPassword) {

        //1. Entering provided invalid email in email input box
        loginPage.emailInput.sendKeys(invalidEmail);

        //2. Entering provided invalid user's password in password input box
        loginPage.passwordInput.sendKeys(invalidPassword);
    }

    @Then("user sees the error message {string}")
    public void userSeesTheErrorMessage(String expectedErrorMessage) {
        //Using assertion void method assertErrorMessage from LoginPage POM
        loginPage.assertErrorMessage(expectedErrorMessage);
    }
}
