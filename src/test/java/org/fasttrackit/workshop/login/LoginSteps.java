package org.fasttrackit.workshop.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.util.TestBase;
import org.fasttrackit.util.TestBaseNative;
import org.fasttrackit.workshop.menu.MainMenuView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginSteps extends TestBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    public static String VALID_EMAIL = "eu@fast.com";
    public static String VALID_PASSWORD = "eu.pass";

    private LoginView loginPage = new LoginView();


    @Given("^the user accesses the login page$")
    public void the_user_accesses_the_login_page() {
        driver.get("file:///D:/AutomationTraining/installers/backup/app-demo/login.html");
    }

    @Given("^he/she inserts valid credentials$")
    public void he_she_inserts_valid_credentials() {
        loginPage.enterCredentials();
    }

    @When("^he/she clicks the login button$")
    public void he_she_clicks_the_login_button() {
        loginPage.clickOnLoginButton();
    }


    @Then("^he/she checks if the user was logged in$")
    public void he_she_checks_if_the_user_was_logged_in() {
        MainMenuView.logoutLink.assertExists();
    }

    @Given("^he/she inserts invalid credentials$")
    public void he_she_inserts_invalid_credentials() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(VALID_EMAIL);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(VALID_PASSWORD);
    }

    @Then("^he/she expects an invalid credentials message$")
    public void he_she_expects_an_invalid_credentials_message() {
        loginPage.errorMessageShouldBePresent("Invalid user!");
    }

    @When("^the user enters \"([^\"]*)\"/\"([^\"]*)\" credentials$")
    public void the_user_enters_credentials(String emailValue, String passValue) {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(emailValue);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(passValue);
    }

    @Then("^he/she expects error message$")
    public void he_she_expects_error_message() {
        loginPage.errorMessageShouldBePresent("Invalid user or password!");
    }

    @Then("^he/she expects \"([^\"]*)\" error message$")
    public void he_she_expects_error_message(String msg) throws Throwable {
        loginPage.errorMessageShouldBePresent(msg);
    }
}