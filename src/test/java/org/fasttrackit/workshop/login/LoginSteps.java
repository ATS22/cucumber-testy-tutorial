package org.fasttrackit.workshop.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.util.TestBaseNative;
import org.fasttrackit.workshop.pagefactory.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps extends TestBaseNative {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    LoginPage loginPage;

    @Given("^I open login page$")
    public void I_open_login_page() {
        driver.get("file:///D:/Testy/src/test/functional/login.html");

        //loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void I_enter_email(String email) {
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys(email);
    }

    @Given("^the user accesses the login page$")
    public void the_user_accesses_the_login_page() throws Throwable {
        System.out.println("aici ar trebui sa se deschida pagina");
        throw new PendingException();
    }

    @And("^he/she inserts valid credentials$")
    public void he_she_inserts_valid_credentials() throws Throwable {
        System.out.println("introduc username is parola");
        throw new PendingException();
    }

    @When("^he/she clicks the login button$")
    public void he_she_clicks_the_login_button() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^he/she checks if the user was logged in$")
    public void he_she_checks_if_the_user_was_logged_in() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^he/she inserts invalid credentials$")
    public void he_she_inserts_invalid_credentials() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^he/she expects an invalid credentials message$")
    public void he_she_expects_an_invalid_credentials_message() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Given("^I open this url \"([^\"]*)\"$")
    public void I_open_this_url(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^I send (\\d+) into search field$")
    public void I_send_into_search_field(int arg1) throws Throwable {
        System.out.println("numarul este 5" + arg1);
    }
}
