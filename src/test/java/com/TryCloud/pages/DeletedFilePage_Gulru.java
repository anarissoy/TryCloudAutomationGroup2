package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedFilePage_Gulru {
    public DeletedFilePage_Gulru(){
        PageFactory.initElements(Driver.getDriver(),this);}


        @FindBy (xpath = "//ul[@id='appmenu']/li[2]")
                public WebElement clickFile;

        @FindBy (xpath="(//span[@class='icon icon-more'])[3]")
                public WebElement optionBox;

        @FindBy (xpath = "//a[@data-action='Delete']")
                public WebElement deleteFile;

        @FindBy (xpath = "//a[.='Deleted files']")
                public WebElement deletedFiles;
        @FindBy (xpath="//span[.='creepy-cat-cat-smile']")
                public WebElement deletedFile;
}
