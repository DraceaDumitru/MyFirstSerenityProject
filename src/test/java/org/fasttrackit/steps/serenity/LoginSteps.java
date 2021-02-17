package org.fasttrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigate_to_Login(){
        homePage.open();
        homePage.click_Account_link();
    }
    @Step
    public void set_Email(String email){
        loginPage.set_Email_field(email);
    }
    @Step
    public void set_Password(String password){
        loginPage.set_Password_field(password);
    }
    @Step
    public void click_Login_button(){
        loginPage.click_Login_button();
    }
    @Step
    public void login(String username, String password){
        navigate_to_Login();
        set_Email(username);
        set_Password(password);
        click_Login_button();
    }
    @Step
    public void verify_account_message(String email){
        accountPage.verify_hello_message(email);
    }
    @Step
    public void verify_if_message_is_displayed(){
        Assert.assertTrue(accountPage.return_if_hello_msg_is_displayed());
    }
    @Step
    public void return_confirmation(){Assert.assertTrue(accountPage.return_if_confirm_msg_is_displayed());}
}
