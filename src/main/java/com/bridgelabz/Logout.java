package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends Base {

    @FindBy(xpath = "//*[@id=\"ember33\"]")
    WebElement profile;

    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement sign_out;

    public Logout(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void clickOnProfile() throws InterruptedException {
        profile.click();
        Thread.sleep(2000);
    }

    public void signOut() throws InterruptedException {
        Thread.sleep(2000);
        sign_out.click();
    }

    public String logout() throws InterruptedException {
        Log.info("clicking to profile");
        clickOnProfile();
        Thread.sleep(2000);
        Log.info("clicking for sign_out");
        signOut();
        Thread.sleep(2000);
        return driver.getTitle();
    }
}
