package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalihUS4_Page {
    public SalihUS4_Page(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> allModules;

    @FindBy(xpath = "(//thead)[1]//label[@for='select_all_files']")
    public WebElement selectAllCheckBox;

    @FindBy(xpath = "//tbody[@id='Userpass123']//label")
    public List<WebElement> isSelected;
}
