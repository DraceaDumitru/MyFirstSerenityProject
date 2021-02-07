package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.WishlistSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class WishlistTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private WishlistSteps wishlistSteps;

    @Test
    public void addProductToWishlistTest() {

        wishlistSteps.wishlist();

    }
}