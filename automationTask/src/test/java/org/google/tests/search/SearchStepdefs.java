package org.google.tests.search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.google.browser.Browser;
import org.google.tests.BaseTest;
import org.testng.Assert;

public class SearchStepdefs extends BaseTest {
    @When("website is opened")
    public void websiteIsOpened() {
        browser = new Browser();
        browser.google.search.waitUnitlPageLoaded();
    }

    @Then("search button should be displayed")
    public void searchButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.google.search.getSearchBox().isDisplayed());
    }

    @And("Google search button should be displayed")
    public void googleSearchButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.google.search.getSearchButton().isDisplayed());
    }

    @And("Iam Feeling Lucky button should be displayed")
    public void iamFeelingLuckyButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.google.search.getIamFeelingLuckyButton().isDisplayed());

    }

    @And("Search by voice button should be displayed")
    public void searchByVoiceButtonShouldBeDisplayed() {
        Assert.assertTrue(browser.google.search.getSearchByVoiceButton().isDisplayed());

    }

    @And("search for {string}")
    public void searchFor(String searchQuery) {
        browser.google.search.typeOnSearchBox(searchQuery);
        browser.google.resultSearch = browser.google.search.clickOnSearchButton();
    }

    @Then("{string} should be disaplyed in search result Page")
    public void shouldBeDisaplyedInSearchResultPage(String search) {
        Assert.assertTrue(browser.google.resultSearch.checkSearchKeywordInSearchResult(search));
    }

    @Then("Calculator Section should be displayed in the result page")
    public void calculatorSectionShouldBeDisplayedInTheResultPage() {
        browser.google.resultSearch.getCalculatorSection().isDisplayed();
    }

    @Then("{string} should be displayed in search Calculator bar")
    public void shouldBeDisplayedInSearchCalculatorBar(String equationAnswer) {
        Assert.assertEquals(browser.google.resultSearch.getResultOfMathEquation().getText(), equationAnswer);
    }

    @Then("{string} should be displayed in search result page")
    public void shouldBeDisplayedInSearchResultPage(String correctedKeyword) {
        Assert.assertEquals(browser.google.resultSearch.getCorrectedKeywordLink().getText(), correctedKeyword);
    }

    @When("click on the corrected keyword link")
    public void clickOnTheCorrectedKeywordLink() {
       browser.google.resultSearch.clickOnCorrectedKeywordLink();
    }
}


