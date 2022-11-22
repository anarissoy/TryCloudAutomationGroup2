package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.Tulay_US_05_Page;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US_5_StepDefs {
    LoginPage loginPage = new LoginPage();
    Tulay_US_05_Page tulay_us_05_page = new Tulay_US_05_Page();

//    @Given("user on the dashboard page")
//    public void userOnTheDashboardPage() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
//        loginPage.login(ConfigurationReader.getProperty("user2"),ConfigurationReader.getProperty("password"));
//        BrowserUtils.waitFor(3);
//        Assert.assertEquals("Dashboard - Trycloud",Driver.getDriver().getTitle());
//        BrowserUtils.waitFor(3);
//    }
//
//    @When("the user clicks the Files module")
//    public void the_user_clicks_the_files_module() {
//
//        Tulay_US_05_Page.files.click();
//        BrowserUtils.waitFor(3);
//    }

    @When("the user clicks action-icon  from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(Tulay_US_05_Page.actionsBtn).perform();
        BrowserUtils.waitFor(3);
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String arg0) {
        Tulay_US_05_Page.addToFavs.click();
        BrowserUtils.waitFor(3);
    }
    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String arg0) {
        Tulay_US_05_Page.allFavorites.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
        Assert.assertFalse(Tulay_US_05_Page.allFavorites.getText().equalsIgnoreCase("No favorites yet"));

    }
}
