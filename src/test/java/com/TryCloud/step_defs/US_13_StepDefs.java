package com.TryCloud.step_defs;

import com.TryCloud.pages.US_13_Page;
import com.TryCloud.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_13_StepDefs {

    US_13_Page us_13_page = new US_13_Page();
    Faker faker = new Faker();


    @Then("verify the contact names are in the list")
    public void verifyTheContactNamesAreInTheList() {

        BrowserUtils.waitFor(2);
        us_13_page.createNewContactBtn.click();
        us_13_page.inputName.clear();
        String sendKeys = faker.name().fullName();
        us_13_page.inputName.sendKeys(sendKeys);
        us_13_page.inputTel.sendKeys(faker.phoneNumber().cellPhone());
        us_13_page.inputEmail.sendKeys(faker.internet().emailAddress());
        us_13_page.inputAddress.sendKeys(faker.address().fullAddress());
        us_13_page.inputPostalCode.sendKeys(faker.address().zipCode());
        us_13_page.inputCity.sendKeys(faker.address().city());
        us_13_page.inputState.sendKeys(faker.address().state());
        us_13_page.inputCountry.sendKeys(faker.address().country());
        BrowserUtils.waitFor(1);
        us_13_page.clickContactBtn.click();

        us_13_page.verifyUS13();


    }


}
