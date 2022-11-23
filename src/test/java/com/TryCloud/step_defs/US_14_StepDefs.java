package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.US_13_Page;
import com.TryCloud.pages.US_14_Page;
import com.TryCloud.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US_14_StepDefs {

    LoginPage loginPage = new LoginPage();
    US_14_Page us_14_page = new US_14_Page();
    Faker faker = new Faker();

    String verify = "";
    @When("the user clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        us_14_page.lupaClick.click();
        BrowserUtils.waitFor(2);
    }

    @And("users search any existing file,folder,user name")
    public void usersSearchAnyExistingFileFolderUserName() {
        String send = "User";
        verify += send;
        us_14_page.searchBox.sendKeys(send + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("verify the app displays the expected result option")
    public void verifyTheAppDisplaysTheExpectedResultOption() {
        us_14_page.getSearchList(verify);
    }
}
