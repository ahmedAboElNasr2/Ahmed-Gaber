package org.google.tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test
    public void test(){
        browser.google.search.typeOnSearchBox("fsdf");
    }

}
