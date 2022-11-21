package com.TryCloud.step_defs;

import com.TryCloud.pages.FilesPageMayira;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US10_StepDefs_Mayira {

    FilesPageMayira filesPage = new FilesPageMayira();
    int initialUsage = 0;


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        filesPage.login(ConfigurationReader.getProperty("user32"), ConfigurationReader.getProperty("password"));
    }

    @When("user clicks the {string} module")
    public void user_clicks_the_module(String module) {
        filesPage.click(filesPage.allModules, module);
    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        filesPage.settings.click();
    }

    @Then("user should be able to click any buttons")
    public void user_should_be_able_to_click_any_buttons() {
        List<WebElement> checkboxes = new ArrayList<>(Arrays.asList(filesPage.showRichWorkspacesCheckbox, filesPage.showRecommendationsCheckbox, filesPage.showHiddenFilesCheckbox));
        for (WebElement each : checkboxes) {
            Assert.assertTrue(each.isEnabled());
        }
    }

    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        initialUsage = filesPage.returnNumberFromUsage(filesPage.usage);
    }

    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
        filesPage.addIconBtn.click();
        filesPage.selectFromAddIconDropdown(filesPage.addIconDropdown, "Upload file");
        filesPage.inputFile.sendKeys("/Users/dil/Downloads/apple.png");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(filesPage.loadBar));
    }

    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();
    }

    @Then("user should be able to see storage usage is increased")
    public void user_should_be_able_to_see_storage_usage_is_increased() {
        int updatedUsage = filesPage.returnNumberFromUsage(filesPage.usage);
        Assert.assertTrue(updatedUsage > initialUsage);
    }

}
