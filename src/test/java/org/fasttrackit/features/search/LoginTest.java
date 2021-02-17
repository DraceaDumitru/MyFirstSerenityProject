package org.fasttrackit.features.search;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;



public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void valid_credentials_Login_test(){
        loginSteps.navigate_to_Login();
        loginSteps.set_Email(EnvironmentConstants.USER_EMAIL);
        loginSteps.set_Password(EnvironmentConstants.USER_PASS);
        loginSteps.click_Login_button();
        loginSteps.verify_account_message("denys_1997ddd");
        loginSteps.verify_if_message_is_displayed();
        loginSteps.return_confirmation();
    }

}
