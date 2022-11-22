package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.WriteCommentPage_Denys;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_9_SepDefs {
    LoginPage loginPage = new LoginPage();
    WriteCommentPage_Denys writeCommentPage_denys = new WriteCommentPage_Denys();
//
//    @Given("user on the dashboard page")
//    public void user_on_the_dashboard_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
////        loginPage.inputUsername.sendKeys(username);
////        loginPage.inputPassword.sendKeys(password);
////        loginPage.loginButton.click();
////        Driver.closeDriver();
//        loginPage.login(ConfigurationReader.getProperty("user2"), ConfigurationReader.getProperty("password"));
//
//    }
//
//    @When("the user clicks the {string} module")
//    public void the_user_clicks_the_module(String string) {
//        writeCommentPage_denys.filesModule.click();
//    }
//
//    @When("user click action-icon  from any file on the page")
//    public void user_click_action_icon_from_any_file_on_the_page() {
//        BrowserUtils.waitForClickability(writeCommentPage_denys.threeDots, 20);
//        writeCommentPage_denys.threeDots.click();
//    }
//
//    @When("user choose the {string} option")
//    public void user_choose_the_option(String string) {
//        writeCommentPage_denys.detailsOption.click();
//
//    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        BrowserUtils.waitForClickability(writeCommentPage_denys.commentsTab, 20);
        writeCommentPage_denys.commentsTab.click();
        BrowserUtils.waitForClickability(writeCommentPage_denys.inputComment, 20);
        writeCommentPage_denys.inputComment.click();

        writeCommentPage_denys.inputComment.sendKeys("Hi! It is a test comment.");

    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        writeCommentPage_denys.sendComment.click();

    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        String expectedMessage = "Hi! It is a test comment.";
        String actualMessage = writeCommentPage_denys.displayedMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
