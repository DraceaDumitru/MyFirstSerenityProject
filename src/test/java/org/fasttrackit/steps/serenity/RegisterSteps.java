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

    public void navigateToRegister() {
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickRegisterLink();

    }

    @Step
    public void setFirstNameField(String firstName) { registerPage.setFirstNameField(firstName); }

    @Step
    public void setLastNameField(String lastName) {
        registerPage.setLastNameField(lastName);
    }

    @Step
    public void setEmailField(String email) { registerPage.setEmailField(email); }

    @Step
    public void setPasswordField(String password) { registerPage.setPasswordField(password); }

    @Step
    public void setConfirmPasswordField(String confirmPassword) { registerPage.setConfirmPasswordField(confirmPassword); }

    @Step
    public void clickRegisterButton() { registerPage.clickRegisterButton(); }

    @Step
    public void register(String firstname, String lastname, String email, String password, String confirmPassword) {
        navigateToRegister();
        setFirstNameField(firstname);
        setLastNameField(lastname);
        setEmailField(email);
        setPasswordField(password);
        setConfirmPasswordField(confirmPassword);
        clickRegisterButton(); }

   // @Step
//    public void verifyConfirmationMessage(String successMessage) { accountPage.verifyConfirmationMessage(successMessage); }

    @Step
    public void verifyIfConfirmMessageIsDisplayed(){ Assert.assertTrue(accountPage.returnIfConfirmMsgIsDisplayed()); }
}
