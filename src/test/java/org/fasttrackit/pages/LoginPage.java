package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "button.woocommerce-Button.button")
    private WebElementFacade loginButton;


    public void set_Email_field(String userName){
        typeInto(emailField,userName);
    }
    public void set_Password_field(String password){
        typeInto(passwordField,password);
    }
    public void click_Login_button(){
        clickOn(loginButton);
    }

}
