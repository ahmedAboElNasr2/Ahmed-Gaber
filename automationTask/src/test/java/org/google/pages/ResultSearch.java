package org.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultSearch extends BasePage{

    @FindBy (css = "div.VwiC3b")
    private List<WebElement> paragraphBelowLinks;

    @FindBy(css = "div.mF5fo")
    private WebElement arithmeticOperations;

    @FindBy (css ="div.z7BZJb.XSNERd")
    private WebElement resultOfMathEquation;

    @FindBy (css = "#oFNiHe a")
    private  WebElement correctedKeywordLink;


    public List<WebElement> getParagraphBelowLinks(){
        return paragraphBelowLinks;
    }

    public WebElement getCalculatorSection(){
        return arithmeticOperations;
    }

    public WebElement getResultOfMathEquation(){
        return resultOfMathEquation;
    }

    public WebElement getCorrectedKeywordLink(){
        return correctedKeywordLink;
    }

    public void clickOnCorrectedKeywordLink(){
        correctedKeywordLink.click();
    }

    public boolean checkSearchKeywordInSearchResult (String searchKeyword){
        boolean flag = false;

        for (WebElement paragraph : paragraphBelowLinks){
            if (paragraph.getText().toUpperCase().contains(searchKeyword.toUpperCase())) {
                flag = true;
                break;
            }
        }
        return  flag;
    }
}
