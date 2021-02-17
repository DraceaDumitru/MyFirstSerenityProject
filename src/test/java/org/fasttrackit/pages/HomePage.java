package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(id = "menu-item-122")
    private WebElementFacade account_link;

    @FindBy(css = "label .search-field")
    private WebElementFacade search_field;

    @FindBy(css = ".search-submit")
    private WebElementFacade search_icon;

    @FindBy(css = ".search-submit")
    private WebElementFacade click_on_button;

    @FindBy(id = "menu-item-123")
    private WebElementFacade shop_field;

    @FindBy(id = "menu-item-124")
    private WebElementFacade cart_field;

    @FindBy(id = "menu-item-125")
    private WebElementFacade checkout_field;

    @FindBy(className = "cart-contents")
    private WebElementFacade cart_icon;

    public void click_Account_link(){ /*waitFor(accountLink);*/ clickOn(account_link); }

    public void set_Search_field(String text){typeInto(search_field,text);}

    public void click_Search_icon(){clickOn(search_icon); }

    public void setClick_on_button(){clickOn(click_on_button);}

    public void click_Shop_link(){clickOn(shop_field);}

    public void click_Cart_link(){clickOn(cart_field);}

    public void click_Checkout_link(){clickOn(checkout_field);}

    public void click_Cart_icon(String text){typeInto(cart_icon,text);}


}
