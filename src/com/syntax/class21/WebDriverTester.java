package com.syntax.class21;

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
        fireFox.closeBrowser();*/

        /*WebDriver webDriver= new GoogleChrome();
        webDriver.openWebsite();
        webDriver.signup();
        webDriver.login();
        webDriver.enterUserPassword();
        webDriver.clickSubmit();
        webDriver.closeBrowser();*/

        /*WebDriver[]webDrivers={new GoogleChrome(), new Safari(), new FireFox()};
        for (WebDriver wb: webDrivers){

            wb.openWebsite();
            wb.signup();
            wb.login();
            wb.enterUserPassword();
            wb.clickSubmit();
            wb.closeBrowser();
        }*/
   // GoogleChrome googleChrome= new WebDriverTester(); not allowed
        WebDriver webDriver = new GoogleChrome();
       // chrome.specialMethod(); it doesn't execute here because it is a method in subclass parent class doesn't know about it
        GoogleChrome chrome=(GoogleChrome) webDriver;//this is allowed this is down casting here we lose data
        chrome.specialMethod();//it is executed

    }
}
