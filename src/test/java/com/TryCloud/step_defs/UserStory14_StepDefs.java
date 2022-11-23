package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.UserStory14Page;
import com.TryCloud.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class UserStory14_StepDefs {

    LoginPage loginPage = new LoginPage();
    UserStory14Page userStory14Page = new UserStory14Page();
    Faker faker = new Faker();

    String verify = "";
    @When("the user clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        userStory14Page.lupaClick.click();
        BrowserUtils.waitFor(2);
    }

    @And("users search any existing file,folder,user name")
    public void usersSearchAnyExistingFileFolderUserName() {
        String send = "User";
        verify += send;
        userStory14Page.searchBox.sendKeys(send + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("verify the app displays the expected result option")
    public void verifyTheAppDisplaysTheExpectedResultOption() {
        userStory14Page.getSearchList(verify);
    }
}
