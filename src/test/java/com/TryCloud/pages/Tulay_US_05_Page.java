package com.TryCloud.pages;

import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Tulay_US_05_Page extends BasePage{

    @FindBy(xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[5]")
    public  static WebElement actionsBtn;

    @FindBy(xpath = "//span[text()='Add to favorites']")
    public static WebElement addToFavs;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg active']")
    public static WebElement allFavorites;

    @FindBy(xpath = "//h2[normalize-space()='No favorites yet']")
    public WebElement notInFavs;

    @FindBy(css = "li[data-id='files'] > a > svg > image")
    public static WebElement files;

    public void login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();

    }

}
