package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class StepsToAddCart  {
    private HomePage homePage;

    @Step
    public void clickSearch() {
        homePage.click_Search_icon();
    }

    @Step
    public void click_Shop_link(){homePage.click_Shop_link();}

}
