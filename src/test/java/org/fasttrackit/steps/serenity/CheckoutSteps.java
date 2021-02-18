package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps {
    HomePage homePage;
    @Step
    public void click_home_button(){homePage.click_on_home_button();}
    @Step
    public void click_checkout_link(){homePage.click_Checkout_link();}

}
