package org.fasttrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class CartSteps {
    HomePage homePage;

    @Step
    public void click_Cart_link(){homePage.click_Cart_link();}

    @Step
    public void click_cart_icon(){homePage.click_Cart_icon();}

}
