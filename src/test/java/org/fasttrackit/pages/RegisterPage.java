package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class RegisterPage extends PageObject {
    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(3) > button")
    private WebElementFacade registerButton;


    public void set_Email_field(String email){
        typeInto(emailField,email);
    }
    public void set_Password_field(String password){
        typeInto(passwordField,password);
    }
    public void click_Register_button(){ clickOn(registerButton);
    }
}
