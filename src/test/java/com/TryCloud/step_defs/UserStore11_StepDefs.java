package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.UserStore11Page;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UserStore11_StepDefs {

    LoginPage loginPage = new LoginPage();
    UserStore11Page userStore11Page = new UserStore11Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        loginPage.login(string, string2);

    }



    @When("the user clicks the  {string} module")
    public void theUserClicksTheModule(String arg0) {
        BrowserUtils.waitFor(3);
        userStore11Page.TalkBtn.click();
        BrowserUtils.waitFor(3);

    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String arg0) {
        Assert.assertEquals("Talk - Trycloud QA",Driver.getDriver().getTitle());
    }

    // This is test case 2

    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
       userStore11Page.searchBox.sendKeys("User70");
        BrowserUtils.waitFor(3);
       userStore11Page.userNameBtn.click();
       BrowserUtils.waitFor(3);
    }

    @And("user write a message")
    public void userWriteAMessage() {
        BrowserUtils.waitFor(3);
        userStore11Page.textMsgBtn.sendKeys("london");
        BrowserUtils.waitFor(3);
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        BrowserUtils.waitFor(3);
        userStore11Page.submitBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog() {
        userStore11Page.verifyMsg();



    }
}



