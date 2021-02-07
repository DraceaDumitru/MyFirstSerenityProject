package org.fasttrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultPage;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Step
    public void setSearch(String value) {
        homePage.setSearchField(value);
    }

    @Step
    public void clickSearch() {
        homePage.clickSearchIcon();
    }

    @Step
    public void search(String value) {
        setSearch(value);
        clickSearch();
    }
    @Step
    public void verifyIfProductIsDisplayed(String productName){
        Assert.assertTrue(searchResultPage.isProductDisplayed( productName));
    }
    @Step
    public void verifyIfProductPriceIsDisplayed(String productName){
        Assert.assertTrue(searchResultPage.isProductPriceDisplayed( productName));
    }

}
