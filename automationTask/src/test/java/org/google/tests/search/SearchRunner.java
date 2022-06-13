package org.google.tests.search;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/org/google/tests/search/Search.feature",
                 glue = "org/google/tests",
           //      tags = "@Regression",
                 plugin = {"pretty", "html:target/reports/report.html" } )
public class SearchRunner extends AbstractTestNGCucumberTests {
}

