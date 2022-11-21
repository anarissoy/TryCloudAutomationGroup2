package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage_FK;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefs_FK {
LoginPage_FK loginPage =new LoginPage_FK();


    @Given("user on the login page...")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username1, String password1) {
loginPage.inputUsername.sendKeys(username1);
loginPage.inputPassword.sendKeys(password1);
    }

    @When("user click the login button...")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("verify the user should be at the dashboard page ...")
    public void verify_the_user_should_be_at_the_dashboard_page() {
String actulTitle =  Driver.getDriver().getTitle();

        Assert.assertEquals("Dashboard - Trycloud",actulTitle);
    }
    }

