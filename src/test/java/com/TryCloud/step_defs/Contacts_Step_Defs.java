package com.TryCloud.step_defs;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.Marjan_ContactsPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.configuration.ConfigurationUtils;
import org.junit.Assert;

public class Contacts_Step_Defs extends BasePage{
    LoginPage loginPage = new LoginPage();
    Marjan_ContactsPage contactsPage = new Marjan_ContactsPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        loginPage.login(ConfigurationReader.getProperty("user2"), ConfigurationReader.getProperty("password"));

        String expected = "Dashboard";
        String actual = Driver.getDriver().getTitle();

        Assert.assertTrue(expected.contains(actual));

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String contactsModule) {
        contactsPage.contactsModule.click();
        BrowserUtils.sleep(10);


    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String title) {
        String expectedTitle = "Contacts - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
