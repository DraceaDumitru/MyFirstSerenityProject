package org.fasttrackit.features.search;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private LoginSteps loginSteps;
    @Test
    public void search_Product_test(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        searchSteps.clickSearch();
        searchSteps.setSearch("BELT\n");
      //  searchSteps.click_button();
        searchSteps.verifyIfProductIsDisplayed("BELT");
    }
    @Test
    public void search_Product_Price(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        searchSteps.clickSearch();
        searchSteps.setSearch("55,00");
        searchSteps.click_button();
        searchSteps.verifyIfProductPriceIsDisplayed("55,00 lei");
    }
}
