package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "inputEmail")
    public WebElement  userNameInput;

    @FindBy(id ="inputPassword")
    public WebElement passWordInput;

    //@FindBy(xpath = "/html[1]/body[1]/form[1]/button[1]")
    //@FindBy(xpath = "//*[@id=\"login-form\"]/button")
    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement sighnInButton;




    }
