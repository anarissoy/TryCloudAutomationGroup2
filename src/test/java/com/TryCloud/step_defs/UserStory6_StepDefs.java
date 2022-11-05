package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.UserStory6Page;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Map;

public class UserStory6_StepDefs {

    LoginPage loginPage = new LoginPage();
    UserStory6Page userStory6Page = new UserStory6Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        loginPage.login(string, string2);
    }

    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        BrowserUtils.waitFor(2);
        userStory6Page.fileButton.click();
        BrowserUtils.waitFor(4);
    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(userStory6Page.rightClickOnFile).perform();
    }
    @When("user choose the Remove from favorites option")
    public void user_choose_the_remove_from_favorites_option() {
        BrowserUtils.waitFor(1);
        if (userStory6Page.addToFavorites.getText().equalsIgnoreCase("Add to favorites")) {
            userStory6Page.addToFavorites.click();
            BrowserUtils.waitFor(1);
            Actions actions2 = new Actions(Driver.getDriver());
            actions2.contextClick(userStory6Page.rightClickOnFile).perform();
            BrowserUtils.waitFor(1);
            userStory6Page.addToFavorites.click();
        } else {
            BrowserUtils.waitFor(1);
            userStory6Page.addToFavorites.click();
            BrowserUtils.waitFor(2);
        }
    }
    @When("user click the Favorites sub-module on the left side")
    public void user_click_the_favorites_sub_module_on_the_left_side() {
        userStory6Page.favoritesBtn.click();
        BrowserUtils.waitFor(3);
    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        if (userStory6Page.verifyNoFavorites.getText().equalsIgnoreCase("No favorites yet")) {
            Assert.assertEquals("FAILED", "No favorites yet", userStory6Page.verifyNoFavorites.getText());
        } else {
            Assert.assertFalse(userStory6Page.rightClickOnFile.getText().equalsIgnoreCase(userStory6Page.verifyFavorites.getText()));
        }
    }

    // TC2
    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        BrowserUtils.waitFor(1);
    }
    @And("users uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() {
        BrowserUtils.waitFor(1);
        userStory6Page.inputButton.sendKeys("C:\\Users\\TRIADA\\Desktop\\CYDEO\\case\\anaris - Copy (5).txt");
    }

    @Then("Then verify the file is displayed on the page")
    public void thenVerifyTheFileIsDisplayedOnThePage() {
        BrowserUtils.waitFor(1);
        Driver.getDriver().navigate().refresh();
        System.out.println(userStory6Page.recomendBtn.getText());
        Assert.assertTrue(userStory6Page.recomendBtn.getText().contains("anaris - Copy (5).txt"));
    }
}
