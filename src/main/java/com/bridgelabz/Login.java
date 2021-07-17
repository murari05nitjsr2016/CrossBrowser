package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signIn;

    @FindBy(id="username")
    WebElement emailOrMob;

    @FindBy(id = "password")
    WebElement pwd;

    @FindBy(xpath= "//button[normalize-space()='Sign in']")
    WebElement signIn2;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignIn() {
        signIn.click();

    }

    public void setEmail(String inputEmail) throws InterruptedException {
        Thread.sleep(2000);
        emailOrMob.sendKeys(inputEmail);
    }

    public void setPwd(String password) {
        pwd.sendKeys(password);

    }

    public void clickOnSignIn2() {
        signIn2.click();

    }
    public void login(String userName, String passWord) throws InterruptedException {
        Log.info("clicking on sign_in button");
        clickOnSignIn();
        Thread.sleep(2000);
        Log.info("entering user name");
        setEmail(userName);
        Thread.sleep(2000);
        Log.info("entering password");
        setPwd(passWord);
        Thread.sleep(2000);
        Log.info("clicking to use application ");
        clickOnSignIn2();

    }public void login() throws InterruptedException {
        Log.info("clicking on sign_in button");
        clickOnSignIn();
        Thread.sleep(2000);
        Log.info("entering user name");
        setEmail("murari05nitjsr2016@gmail.com");
        Thread.sleep(2000);
        Log.info("entering password");
        setPwd("N6202046209@n");
        Thread.sleep(2000);
        Log.info("clicking to Enter into application ");
        clickOnSignIn2();

    }





}
