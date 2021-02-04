package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = false)
    private WebDriver webDriver;
    @Steps
    private RegisterSteps registerSteps;
    @Test
    public void validCredentialsRegisterTest(){
        registerSteps.navigateToRegister();
        registerSteps.setFirstNameField("Slim");
        registerSteps.setLastNameField("Shady");
        registerSteps.setEmailField("slimshady@cocotier.com");
        registerSteps.setPasswordField("rapgod");
        registerSteps.setConfirmPasswordField("rapgod");
        registerSteps.clickRegisterButton();
     //  registerSteps.verifyConfirmationMessage("Slim Shady");

    }
}
