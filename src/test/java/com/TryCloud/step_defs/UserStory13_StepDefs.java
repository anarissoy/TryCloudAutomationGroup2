package com.TryCloud.step_defs;

import com.TryCloud.pages.UserStory13Page;
import com.TryCloud.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;

public class UserStory13_StepDefs {

    UserStory13Page userStory13Page = new UserStory13Page();
    Faker faker = new Faker();


    @Then("verify the contact names are in the list")
    public void verifyTheContactNamesAreInTheList() {

        BrowserUtils.waitFor(2);
        userStory13Page.createNewContactBtn.click();
        userStory13Page.inputName.clear();
        String sendKeys = faker.name().fullName();
        userStory13Page.inputName.sendKeys(sendKeys);
        userStory13Page.inputTel.sendKeys(faker.phoneNumber().cellPhone());
        userStory13Page.inputEmail.sendKeys(faker.internet().emailAddress());
        userStory13Page.inputAddress.sendKeys(faker.address().fullAddress());
        userStory13Page.inputPostalCode.sendKeys(faker.address().zipCode());
        userStory13Page.inputCity.sendKeys(faker.address().city());
        userStory13Page.inputState.sendKeys(faker.address().state());
        userStory13Page.inputCountry.sendKeys(faker.address().country());
        BrowserUtils.waitFor(1);
        userStory13Page.clickContactBtn.click();

        userStory13Page.verifyUS13();


    }
}
