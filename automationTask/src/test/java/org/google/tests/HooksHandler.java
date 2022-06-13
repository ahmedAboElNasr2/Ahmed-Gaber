package org.google.tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.google.browser.Browser;
import org.google.driverHandler.DriverHandler;

public class HooksHandler extends BaseTest {

    @Before()
    public void setup(){
        driverHandler = new DriverHandler();
//        browser = new Browser();
        driverHandler.naviage();
    }

    @After
    public void teardown(){
        driverHandler.close();
    }


}
