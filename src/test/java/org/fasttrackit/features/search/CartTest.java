package org.fasttrackit.features.search;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.AddToCartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
    private AddToCartSteps addToCartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addProductToCartTest() {
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        addToCartSteps.clickBlazers();
    }
}
