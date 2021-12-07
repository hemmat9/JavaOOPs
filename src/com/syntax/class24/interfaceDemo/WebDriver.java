package com.syntax.class24.interfaceDemo;

import java.sql.Driver;

//Create a WebDriver Interface that will have the following unimplemented behaviour:
// openBrowser(), closeBrowser(), maximizeWindow(), findElement().
// Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening the Google Chrome");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing the Google Chrome");
    }
    @Override
    public void findElement(){
        System.out.println("Finding Elements in Google Chrome");
    }
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("Finding Elements in FireFox");
    }
}