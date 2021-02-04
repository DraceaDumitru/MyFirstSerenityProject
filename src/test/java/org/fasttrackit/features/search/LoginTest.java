package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest(){
        loginSteps.navigateToLogin();
        loginSteps.setEmail("denys_1997ddd@yahoo.com");
        loginSteps.setPassword("urage123");
        loginSteps.clickLoginButton();
        loginSteps.verifyAccountMessage("Bad Buji");

//        loginSteps.login("denys_1997ddd@yahoo.com","urage123");
    }

}
