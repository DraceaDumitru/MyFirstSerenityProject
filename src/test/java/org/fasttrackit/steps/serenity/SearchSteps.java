package org.fasttrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultPage;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage;
    private SearchResultPage searchResultPage;
    @Step
    public void click_home_button(){homePage.click_on_home_button();}
    @Step
    public void setSearch(String text) { homePage.set_Search_field(text); }
    @Step
    public void clickSearch() {
        homePage.click_Search_icon();
    }
    @Step
    public void search(String value) { setSearch(value);clickSearch(); }
    @Step
    public void verifyIfProductIsDisplayed(String productName){ Assert.assertTrue(searchResultPage.is_Product_Displayed( productName)); }
    @Step
    public void verifyIfProductPriceIsDisplayed(String productName){ Assert.assertTrue(searchResultPage.is_Product_Price_Displayed( productName)); }

}
