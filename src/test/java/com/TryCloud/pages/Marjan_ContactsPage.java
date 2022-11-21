package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Marjan_ContactsPage {
    public Marjan_ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "li[data-id='contacts']>a>svg>image")
    public WebElement contactsModule;



}
