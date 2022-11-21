package com.TryCloud.pages;

import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainModulesPage extends BasePage {


    public MainModulesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@id='more-apps']/preceding-sibling::li")
    public List<WebElement> modules;


    public List<String> getModulesText() {
        List<String> modulesText = new ArrayList<>();

        for (int i = 0; i < modules.size() ; i++) {
            BrowserUtils.hover(modules.get(i));
            modulesText.add(modules.get(i).getText());
        }

       return modulesText;
    }

}

  /*  @FindBy(xpath ="//*[@id=\"appmenu\"]/li[1]/a")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement files;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[3]/a")
    public WebElement photos;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[4]/a")
    public WebElement activity;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement talk;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement contacts;


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]/a")
    public WebElement circles;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[9]/a")
    public WebElement calendar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[10]/a")
    public WebElement deck;
*/


