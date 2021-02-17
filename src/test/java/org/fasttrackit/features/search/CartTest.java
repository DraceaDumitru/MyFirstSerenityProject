package org.fasttrackit.features.search;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.StepsToAddCart;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private StepsToAddCart stepsToAddCart;

    @Steps
    private CartPage cartPage;

    @Test
    public void add_Product_to_Cart_test() {
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        stepsToAddCart.click_Shop_link();
        cartPage.first_item();

    }
}
