package com.TryCloud.step_defs;

import com.TryCloud.pages.DashBoardPage_Farag;
import com.TryCloud.pages.ModulePage_Farag;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.pages.LoginPage_Farag;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Farag_StepDefs {
    LoginPage_Farag loginPage = new LoginPage_Farag();
    DashBoardPage_Farag dashBoardPage = new DashBoardPage_Farag();
    ModulePage_Farag modulePage = new ModulePage_Farag();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.waitForVisibility(loginPage.loginButton, 20);
        loginPage.login(ConfigurationReader.getProperty("user2"), ConfigurationReader.getProperty("password"));
        BrowserUtils.waitFor(3);
    }

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertEquals("Dashboard - Trycloud", Driver.getDriver().getTitle());
    }

    @When("user use {string} and {string} and login")
    public void userUseAndAndLogin(String username, String password) {
        loginPage.login(username, password);
    }


}

