package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.WishlistPage;

public class WishlistSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private WishlistPage wishlistPage;
    private AccountPage accountPage;

    @Step
    public void navigateToWishlist() {
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        homePage.clickWishlistLink();
    }
    @Step
    public void wishlist(){
        navigateToWishlist();
    }
}
