package com.bridgelabz;

import com.utility.CrossBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.apache.logging.log4j.Logger.*;

public class Base {
    public static WebDriver driver;

    //public static Logger logger;
    @BeforeTest
    @Description("Used setUp method for setting the browser")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Navigating to url : https://www.linkedin.com")
    @Parameters({"browserName", "url"})
    public void setUp(String browserName, String url) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();

        Log.info("Test is starting");
        Log.info("browserName is launching");
        //driver = new ChromeDriver();
        driver = CrossBrowser.crossBrowser(browserName);
        Log.info("navigating to url : https://www.linkedin.com/");
        driver.get(url);
        driver.manage().window().maximize();
        Log.info("Launched the web application.");
        Thread.sleep(5000);
    }

    // @AfterTest
    @Description("used tearDown method for closing the browser")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Closing the browser")

    public void tearDown() {
        Log.info("Browser is closed");
        driver.close();
        Log.info("Test is ended");

    }
}
