package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AccountPage extends PageObject {

    @FindBy(css = "#post-120 > div > div > div > p:nth-child(1)")
    private WebElementFacade helloMsg;
    @FindBy(css = "#post-120 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade confirmationMsg;
    @FindBy(css = "#post-120 > div > div > ul > li")
    private WebElementFacade check_if_that_account_is_already_exist;

    public void verify_hello_message(String email){
        helloMsg.shouldContainText("Hello "+email);
    }
    public boolean return_if_hello_msg_is_displayed(){
        return helloMsg.isDisplayed();
    }
    public boolean return_if_confirm_msg_is_displayed(){ return confirmationMsg.isDisplayed(); }
}
