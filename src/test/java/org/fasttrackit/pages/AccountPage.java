package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade helloMsg;
    @FindBy(css = "Thank you for registering with Madison Island.")
    private WebElementFacade confirmationMsg;

    public void verifyHelloMessage(String userName){
        helloMsg.shouldContainText("Hello, "+userName+"!");
    }
    public boolean returnIfHelloMsgIsDisplayed(){
        return helloMsg.isDisplayed();
    }
  //  public void verifyConfirmationMessage(String successMessage){confirmationMsg.shouldContainText("Hello,"+successMessage+"!");}
    public boolean returnIfConfirmMsgIsDisplayed(){
        return confirmationMsg.isDisplayed();
    }
}
