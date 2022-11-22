package com.TryCloud.step_defs;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.MainModulesPage;
import com.TryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US_3_StepDefs {

   MainModulesPage mainModulesPage = new MainModulesPage();

    LoginPage loginPage = new LoginPage();


    @When("the users  log in with valid credentials")
    public void theUsersLogInWithValidCredentials() {
       //Map<String, String> credentials
      // loginPage.login(credentials.get("username"),credentials.get("password"));

        loginPage.login(ConfigurationReader.getProperty("user2"),ConfigurationReader.getProperty("password"));


    }

    @Then("Verify the user see the following modules:")
    public void verifyTheUserSeeTheFollowingModules(List<String> expectedModules) {

        List<String> actualModuleNames =  mainModulesPage.getModulesText();
        Assert.assertEquals(expectedModules,actualModuleNames);




    }
}
