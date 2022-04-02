package com.ali.ui.pages;

import com.ali.utilities.ConfigReader;
import com.ali.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {
    public SearchResultsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(@class,'a-text-normal')]")
    public List<WebElement> allSearchItemList;


}
