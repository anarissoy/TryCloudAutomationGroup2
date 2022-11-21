package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserStory6Page extends BasePage{

    @FindBy (css = "li[data-id='files'] > a > svg > image")  // #fileList > tr:nth-child(1) > td.filename.ui-draggable.ui-draggable-handle > a > span.fileactions > a.action.action-menu.permanent > span.icon.icon-more
    public WebElement fileButton;

    @FindBy (xpath = "//tr[1]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement actionsButton;

    @FindBy (xpath = "//*[@id='rightClickMenu']/ul/li[1]")
    public WebElement addToFavorites;

    @FindBy (xpath = "//*[@id='fileList']/tr/td[1]/a/span[1]/span[1]")
    public WebElement verifyFavorites;

    @FindBy (xpath = "//h2[normalize-space()='No favorites yet']")
    public WebElement verifyNoFavorites;

    @FindBy (xpath = "//li[@data-id='favorites']")
    public WebElement favoritesBtn;

    @FindBy (xpath = "//tr[1]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement actionsBtn32;

    @FindBy (xpath = "(//span[@class='nametext'])[1]")
    public WebElement rightClickOnFile;

    //TC2

    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement addIconButton;

    @FindBy (css = "span[class='displayname']")
    public WebElement uploadFile;

    @FindBy (xpath = "//input[@type ='file']")
    public WebElement inputButton;

    @FindBy (css= "#uploadprocessbar")
    public WebElement uploadBar;


    @FindBy (xpath = "//div[@id='recommendations']")
    public WebElement recomendBtn;

}
