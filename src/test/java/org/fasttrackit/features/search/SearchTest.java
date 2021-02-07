package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private LoginSteps loginSteps;
    @Test
    public void searchProductTest(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        searchSteps.setSearch("shirt");
        searchSteps.clickSearch();
        //searchSteps.search("necklace");
        searchSteps.verifyIfProductIsDisplayed("SLIM FIT DOBBY OXFORD SHIRT");
    }
    @Test
    public void searchProductPrice(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        searchSteps.setSearch("175");
        searchSteps.clickSearch();
        searchSteps.verifyIfProductPriceIsDisplayed("175,00 RON");
    }
}
