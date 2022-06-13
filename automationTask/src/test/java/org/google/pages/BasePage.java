package org.google.pages;


import org.google.driverHandler.DriverHandler;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    public BasePage (){
        PageFactory.initElements(DriverHandler.getWebDriver(), this);
    }

    public static void waitUnitlPageLoaded(){
        WebDriverWait wait = new WebDriverWait(DriverHandler.getWebDriver(), 35);
        wait.until (webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
