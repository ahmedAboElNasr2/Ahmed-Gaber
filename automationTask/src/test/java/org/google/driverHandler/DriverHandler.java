package org.google.driverHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHandler {

    private static WebDriver webDriver;

    public DriverHandler (){getDriverType();}

    private void getDriverType(){
    	WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public static WebDriver getWebDriver (){ return  webDriver;}

    public void naviage(){
        webDriver.navigate().to("https://www.google.com/");
    }

    public void close (){
        webDriver.quit();
    }

}