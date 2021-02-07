package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

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
