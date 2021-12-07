package com.syntax.class21.polyMorphism;

import com.syntax.class18HomeWork.Teacher;

public class WebDriverTester {
    public static void main(String[] args) {
        /*GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signup();
        googleChrome.login();
        googleChrome.enterUserPassword();
        googleChrome.clickSubmit();
        googleChrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signup();
        fireFox.login();
        fireFox.enterUserPassword();
        fireFox.clickSubmit();
        fireFox.closeBrowser();

        Safari safari = new Safari();
        safari.openWebsite();
        safari.signup();
        safari.login();
        safari.enterUserPassword();
        safari.clickSubmit();
        safari.closeBrowser();*/

        /*WebDriver webDriver= new FireFox();
        webDriver.openWebsite();
        webDriver.signup();
        webDriver.login();
        webDriver.enterUserPassword();
        webDriver.clickSubmit();
        webDriver.closeBrowser();*/


        WebDriver[] webDrivers = {new GoogleChrome(), new FireFox(), new Safari()};
        for (WebDriver a : webDrivers) {
            a.openWebsite();
            a.signup();
            a.login();
            a.enterUserPassword();
            a.clickSubmit();
            a.closeBrowser();

            if (a instanceof GoogleChrome){
                ((GoogleChrome)a).specialMethod();
            }


        }
        //GoogleChrome googleChrome= new WebDriver(); //not allowed
       /* WebDriver webDriver = new GoogleChrome();
        //chrome.specialMethod(); //it doesn't execute here because it is a method in subclass parent class doesn't know about it
        GoogleChrome chrome=(GoogleChrome) webDriver;//this is allowed this is down casting here we lose data
        chrome.specialMethod();//it is executed*/

    }
}

