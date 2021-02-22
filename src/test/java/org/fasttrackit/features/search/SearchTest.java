package org.fasttrackit.features.search;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Ignore;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private HomePage homePage;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void search_Product_test(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        homePage.click_on_home_button();
        searchSteps.setSearch("BELT\n");
        searchSteps.clickSearch();
    //    searchSteps.click_button();
        searchSteps.verifyIfProductIsDisplayed("BELT");
    }
    @Ignore

    public void search_Product_Price(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        homePage.click_on_home_button();
        searchSteps.setSearch("55,00");
        searchSteps.clickSearch();
      //  searchSteps.click_button();
        searchSteps.verifyIfProductPriceIsDisplayed("55,00 lei");
    }
}
