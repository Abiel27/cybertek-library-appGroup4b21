package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends PageBase{
    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user_count")
    public WebElement userCount;
}
