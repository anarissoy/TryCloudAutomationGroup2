package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.SalihUS4_Page;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SalihUS4_StepDefinition {
    SalihUS4_Page us4Page = new SalihUS4_Page();
    LoginPage loginPage = new LoginPage();

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login(ConfigurationReader.getProperty("user92"),ConfigurationReader.getProperty("password"));
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String module) {
        for (WebElement each : us4Page.allModules) {
            if (each.getAttribute("aria-label").equals(module)){
                each.click();
                break;
            }
        }
    }
//    @Then("verify the page title is {string}")
//    public void verifyThePageTitleIs(String expectedTitle) {
//        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
//    }

//    ==================================================


    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        us4Page.selectAllCheckBox.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        for (WebElement each : us4Page.isSelected) {
            each.isSelected();
        }
    }
}
