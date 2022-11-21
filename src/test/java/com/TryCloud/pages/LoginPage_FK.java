package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_FK extends BasePage{


    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy (id = "password")
    public WebElement inputPassword;

    @FindBy (id = "submit-form")
    public WebElement loginBtn;

}
