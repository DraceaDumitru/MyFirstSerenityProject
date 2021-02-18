package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HomePage homePage;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void vew_checkout(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        checkoutSteps.click_home_button();
        checkoutSteps.click_checkout_link()
        ;}

}
