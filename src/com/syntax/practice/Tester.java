package com.syntax.practice;

public class Tester {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        chrome.openBrowser();
        chrome.closeBrowser();
        chrome.maximizeBrowser();
        chrome.findElement();

        WebDriver firefox = new Firefox();
        firefox.openBrowser();
        firefox.openBrowser();
        firefox.maximizeBrowser();
        firefox.closeBrowser();
    }
}
