package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteCommentPage_Denys {
     public WriteCommentPage_Denys() {
         PageFactory.initElements(Driver.getDriver(), this);
     }
         @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
                 public WebElement filesModule;

     @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement threeDots;


     @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsOption;


@FindBy(xpath = "//a[@id='commentsTabView']")
public WebElement commentsTab;

     @FindBy(xpath = "//div[@class='message']")
    public WebElement inputComment;


     @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement sendComment;

     @FindBy(xpath = "//div[.='Hi! It is a test comment.']")
    public WebElement displayedMessage;
     }

