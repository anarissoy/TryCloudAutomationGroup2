package com.TryCloud.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserStore11Page extends BasePage{

    @FindBy (css = "li[data-id='spreed']>a>svg")
    public WebElement TalkBtn;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[normalize-space()='User70']")
    public WebElement userNameBtn;



    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement textMsgBtn;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@class='message__main__text']/div")
   public List<WebElement>conversationLog;


  public void verifyMsg(){
      String words = "";
      for(WebElement each:conversationLog){
          if(each.getText().equalsIgnoreCase("london")) {
              words += "" + each.getText();
              break;
          }
      }

      String expectedMsg = "london";
      Assert.assertEquals(expectedMsg,words);

  }


}

