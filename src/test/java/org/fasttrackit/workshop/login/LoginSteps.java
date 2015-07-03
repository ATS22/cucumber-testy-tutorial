package org.fasttrackit.workshop.login;

import com.sdl.selenium.web.utils.Utils;
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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginSteps extends TestBaseNative {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    LoginPage loginPage;

    @Given("^the user accesses the login page$")
    public void the_user_accesses_the_login_page() throws Throwable {
        driver.get("file:///D:/AutomationTraining/installers/backup/app-demo/login.html");
    }

    @And("^he/she inserts valid credentials$")
    public void he_she_inserts_valid_credentials() throws Throwable {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("eu@fast.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("eu.pass");

        Utils.sleep(2000);
    }

    @When("^he/she clicks the login button$")
    public void he_she_clicks_the_login_button() throws Throwable {
        WebElement login = driver.findElement(By.id("loginButton"));
        login.click();
        Utils.sleep(2000);
    }

    @Then("^he/she checks if the user was logged in$")
    public void he_she_checks_if_the_user_was_logged_in() throws Throwable {
        WebElement logout = driver.findElement(By.linkText("Logout"));
        boolean successLoggedIn = logout.isDisplayed();
        assertThat("Could not find logout button", successLoggedIn, is(true));

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
