package com.syntax.class24.interfaceDemo;

import java.sql.Driver;

public class WebDriverTester {
    public static void main(String[] args) {

        /*ChromeDriver driver = new ChromeDriver();
        driver.openBrowser();
        driver.closeBrowser();
        driver.maximizeWindow();
        driver.findElement();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.openBrowser();
        firefoxDriver.closeBrowser();
        firefoxDriver.maximizeWindow();
        firefoxDriver.findElement();*/

        WebDriver [] drivers ={new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver webDriver: drivers){
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();
        }
    }
}
