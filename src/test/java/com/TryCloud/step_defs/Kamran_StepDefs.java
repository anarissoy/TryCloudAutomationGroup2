package com.TryCloud.step_defs;

import com.TryCloud.pages.KamranPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class Kamran_StepDefs {
    LoginPage loginPage = new LoginPage();
    KamranPage kamranPage = new KamranPage();
    Faker faker = new Faker();
    @Given("user should be on the login page")
    public void userShouldBeOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user should enter {string} and {string}")
    public void userShouldEnterAnd(String string, String string2) {
        loginPage.login(string, string2);
    }
    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        kamranPage.fileBtn.click();
        BrowserUtils.waitFor(2);
        kamranPage.addIconBtn.click();
        BrowserUtils.waitFor(2);
    }

    //@Test1
    @And("user click new folder")
    public void userClickNewFolder() {
        kamranPage.newFolder.click();
        BrowserUtils.waitFor(2);
    }
    String folderName = faker.bothify("Framework##");
    @And("user write a folder name")
    public void userWriteAFolderName() {
        kamranPage.writeNewFolder.clear();
        BrowserUtils.waitFor(2);
        kamranPage.writeNewFolder.sendKeys(folderName);
        BrowserUtils.waitFor(2);
    }
    @When("the user click submit icon")
    public void theUserClickSubmitIcon() {
        kamranPage.submitFolderName.click();
    }
    @Then("Verify the folder is displayed on the page")
    public void verifyTheFolderIsDisplayedOnThePage() {
        Assert.assertEquals(folderName, kamranPage.newCreatedFolder.getText());
        System.out.println(kamranPage.newCreatedFolder.getText());
    }

    //@Test2
    String newFolderName = faker.bothify("Framework##");
    @And("user choose a folder from the page")
    public void userChooseAFolderFromThePage() {
        kamranPage.clickNewFolder(newFolderName);
        BrowserUtils.waitFor(3);
    }
    @And("user clicks the add icon on the top")
    public void userClicksTheAddIconOnTheTop() {
    }
    String expectedFileName = "Framework - Copy (3)";
    @When("the user uploads a file with the upload file option")
    public void theUserUploadsAFileWithTheUploadFileOption() {
        kamranPage.inputButton.sendKeys("C:\\Users\\PC\\Desktop\\CYDEO_B27\\Projects\\TryCloud-BDD\\MyFilePath\\"+ expectedFileName + ".txt");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(kamranPage.uploadBar));
    }
    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
          kamranPage.verifyFileName(kamranPage.fileNameVerify, expectedFileName);
    }
}
