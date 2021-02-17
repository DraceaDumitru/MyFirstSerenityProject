package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    public void navigate_to_Register() {
        homePage.open();
        homePage.click_Account_link();
    }
    @Step
    public void set_Email_field(String email) { registerPage.set_Email_field(email); }

    @Step
    public void set_Password_field(String password) { registerPage.set_Password_field(password); }

    @Step
    public void click_Register_button() { registerPage.click_Register_button(); }

    @Step
    public void register(String email, String password) {
        navigate_to_Register();
        set_Email_field(email);
        set_Password_field(password);
        click_Register_button(); }

    @Step
    public void verify_if_confirm_message_is_displayed(){ Assert.assertTrue(accountPage.return_if_confirm_msg_is_displayed()); }
}
