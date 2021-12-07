package com.syntax.practice;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeBrowser();
    void findElement();
}
class ChromeDriver implements WebDriver{
    public void openBrowser (){
        System.out.println("Opening Google Chrome Browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Google Chrome Browser");
    }
    public void maximizeBrowser(){
        System.out.println("Maximizing Google Chrome browser");
    }
    public void findElement(){
        System.out.println("Finding elements in Google Chrome Browser");
    }
}
class Firefox implements WebDriver{
    public void openBrowser (){
        System.out.println("Opening Firefox Browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Firefox Browser");
    }
    public void maximizeBrowser(){
        System.out.println("Maximizing Firefox browser");
    }
    public void findElement(){
        System.out.println("Finding elements in Firefox Browser");
    }
}
class Safari implements WebDriver{
    public void openBrowser (){
        System.out.println("Opening Safari Browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Safari Browser");
    }
    public void maximizeBrowser(){
        System.out.println("Maximizing Safari browser");
    }
    public void findElement(){
        System.out.println("Finding elements in Safari Browser");
    }
}
