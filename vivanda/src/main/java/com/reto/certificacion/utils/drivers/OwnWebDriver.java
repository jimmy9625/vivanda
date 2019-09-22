package com.reto.certificacion.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class OwnWebDriver {

    private WebDriver driver;

    private OwnWebDriver() {

    }

    public static OwnWebDriver newDriver()
    {
        return new OwnWebDriver();
    }


    public WebDriver chrome(String url)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }
}
