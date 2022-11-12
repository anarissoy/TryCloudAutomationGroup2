package com.TryCloud.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPageMayira extends BasePage{

    // Login Page
    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy (id = "password")
    public WebElement inputPassword;

    @FindBy (id = "submit-form")
    public WebElement loginBtn;


    /**
     * login
     * @param username
     * @param password
     */
    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }


    // Home Page
    @FindBy(xpath = "//ul[@id = 'appmenu']//a")
    public List<WebElement> allModules;

    /**
     * This is for click one module from list of modules.
     * @param listOfModules
     * @param nameOfModule
     */
    public void click(List<WebElement> listOfModules, String nameOfModule){
        for (WebElement each: listOfModules){
            if (each.getAttribute("aria-label").equals(nameOfModule)){
                each.click();
                break;
            }
        }
    }

    // File Page
    @FindBy (id = "app-settings-header")
    public WebElement settings;

    @FindBy (id = "files-setting-richworkspace")
    public WebElement showRichWorkspacesCheckbox;

    @FindBy (id = "recommendations-setting-enabled")
    public WebElement showRecommendationsCheckbox;

    @FindBy (id = "files-setting-showhidden")
    public WebElement showHiddenFilesCheckbox;

    @FindBy (xpath = "//li[@id='quota']//p")
    public WebElement usage;

    @FindBy (css = "a[class='button new']")
    public WebElement addIconBtn;

    @FindBy (xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']//li")
    public List<WebElement> addIconDropdown;

    @FindBy (xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy (css = "#uploadprogressbar")
    public WebElement loadBar;


    /**
     * return int number from string
     * @param element
     * @return
     */
    public int returnNumberFromUsage(WebElement element){

        String[] text = element.getText().split(" ");
        return Integer.valueOf(text[0]);

    }

    /**
     * select one option from addIcon button dropdown
     * @param listOfElement
     * @param string
     */
    public void selectFromAddIconDropdown(List<WebElement> listOfElement, String string){
        for (WebElement each: listOfElement){
            if (each.getText().equalsIgnoreCase(string)){
                each.click();
                break;
            }
        }
    }




}
