package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LandingPage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage login = new LoginPage();
    LandingPage landingPage = new LandingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
         String url= ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {

        String username = ConfigurationReader.getProperty("lib22_user");
        login.userNameInput.sendKeys(username);
        String password = ConfigurationReader.getProperty("lib22_pass");
        login.passWordInput.sendKeys(password);
        login.sighnInButton.click();

    }
    @Then("Dashboard should be displayed")
    public void dashboard_should_be_displayed() throws InterruptedException {
        String expected = "dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();

    }

    @When("I login as a student")
    public void iLoginAsAStudent() {
        String username = ConfigurationReader.getProperty("student11_user");
        login.userNameInput.sendKeys(username);
        String password = ConfigurationReader.getProperty("student11_pass");
        login.passWordInput.sendKeys(password);
        login.sighnInButton.click();

    }

    @Then("Book should be displayed")
    public void bookShouldBeDisplayed() {
        String expected = "book";


        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();

    }
    @When("I entered username {string}")
    public void i_entered_username(String string1) {
        String username = string1;
        login.userNameInput.sendKeys(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String string2) {
        String password = string2;
        login.passWordInput.sendKeys(password);

    }
    @When("And click the sigh in button")
    public void and_click_the_sigh_in_button() {
        login.sighnInButton.click();
    }
    @Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        int expectedUserNumber = int1;// 2841 users
        wait.until(ExpectedConditions.visibilityOf(landingPage.userCount));
        String expected = String.valueOf(expectedUserNumber);// i need to change the num to string,
        String actual = landingPage.userCount.getText();

        Assert.assertEquals( "Actual user number is not as expected!",actual,expected);

    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAndMJWr(String username, String password) {
        login.userNameInput.sendKeys(username);
        login.passWordInput.sendKeys(password);
        login.sighnInButton.click();

    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedAccountUsername) {

        BrowserUtils.waitForVisibility(landingPage.accountUserName,5);

        String actualAccountUsername = landingPage.accountUserName.getText();

        Assert.assertEquals(" Account user name is not as expected! ",
                expectedAccountUsername,actualAccountUsername);

        Driver.closeDriver();




    }
}


