package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;
    @Test
    public void valid_credentials_Register_Test(){
        registerSteps.navigate_to_Register();
        registerSteps.set_Email_field("denys_1997ddd@yahoo.com");
        registerSteps.set_Password_field("urageRyzen7");
        registerSteps.click_Register_button();
    }
}
