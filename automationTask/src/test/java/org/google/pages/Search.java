package org.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage{
	
	@FindBy (name = "q")
	private WebElement searchBox;
	
	@FindBy (css = "div.FPdoLc input.gNO89b")
	private WebElement searchButton;
	
	@FindBy (css = "div.FPdoLc input.RNmpXc")
	private WebElement iamFeelingLuckyButton;
	
	@FindBy (css = "#SIvCob a")
	private WebElement switchLanguageButton;

	@FindBy (className = "goxjub")
	private WebElement searchByVoiceButton;

	public WebElement getSearchBox() {return searchBox;}

	public WebElement getSearchButton() {return searchButton;}

	public WebElement getIamFeelingLuckyButton() {return iamFeelingLuckyButton;}

	public WebElement getSearchByVoiceButton() {return searchByVoiceButton;}

	public void typeOnSearchBox(String searchText) {
		searchBox.sendKeys(searchText);
	}
	
	public ResultSearch clickOnSearchButton() {
		searchBox.submit();
		return new ResultSearch();
	}
}
