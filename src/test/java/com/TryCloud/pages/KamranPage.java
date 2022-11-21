package com.TryCloud.pages;

import com.TryCloud.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class KamranPage extends BasePage {
    @FindBy(css = "li[data-id='files']>a>svg>image")
    public WebElement fileBtn;
    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIconBtn;
    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;
    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement writeNewFolder;
    @FindBy(xpath = "//a[@class='filename']")
    public WebElement newCreatedFolder;
    @FindBy(xpath = "//input[@type ='file']")
    public WebElement inputButton;
    @FindBy(id = "uploadprogressbar")
    public WebElement uploadBar;
    @FindBy (xpath = "//input[@id='view13-input-folder']")
    public WebElement inputFolderName;
    @FindBy (xpath = "(//input[@type='submit'])[2]")
    public WebElement submitFolderName;
    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileNameVerify;
    public void clickNewFolder(String newFolderName) {
        BrowserUtils.waitFor(3);
        newFolder.click();
        BrowserUtils.waitFor(1);
        inputFolderName.sendKeys(newFolderName);
        BrowserUtils.waitFor(1);
        submitFolderName.click();
        BrowserUtils.waitFor(1);

        for(WebElement each: fileNameVerify){
            BrowserUtils.hover(each);
            if(each.getText().equalsIgnoreCase(newFolderName)){
                each.click();
                break;
            }
        }
    }
    public void verifyFileName(List<WebElement> listOfElements, String expectedFileName) {
        String actualName = "";
        for (WebElement each : listOfElements) {
            if (each.getText().equalsIgnoreCase(expectedFileName)) {
                actualName += "" + each.getText();
                break;
            }
        }
        System.out.println(actualName);
        Assert.assertEquals(expectedFileName, actualName);
    }
}


