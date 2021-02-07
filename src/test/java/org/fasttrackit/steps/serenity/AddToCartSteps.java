package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class AddToCartSteps {
    private HomePage homePage;

    @Step
    public void clickBlazers(){homePage.clickManBlazersCategory();}
}
