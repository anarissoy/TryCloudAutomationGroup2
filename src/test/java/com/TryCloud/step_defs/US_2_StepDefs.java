package com.TryCloud.step_defs;

import com.TryCloud.pages.YadikarPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_2_StepDefs {
YadikarPage tryCloudPage=new YadikarPage();
//    @Given("user on the login page http:\\/\\/qa3.trycloud.net\\/index.php\\/login?clear={int}")
//    public void user_on_the_login_page_http_qa3_trycloud_net_index_php_login_clear(Integer int1) {
//        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
//    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String userName, String passWord) {
    tryCloudPage.userName.sendKeys(userName);
    tryCloudPage.passwWord.sendKeys(passWord);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
    tryCloudPage.loginBtn.click();
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String expectedMsg) {
        String actualMsg= tryCloudPage.wrongCredentialsMsg.getText();
        Assert.assertEquals(expectedMsg, actualMsg);

    }


}


