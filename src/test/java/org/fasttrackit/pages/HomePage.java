package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;
    @FindBy(css = "a[title*='Log']")
    private WebElementFacade loginLink;
    @FindBy(css = "a[title*='Register']")
    private WebElementFacade registerLink;
    @FindBy(css = "a[title*='My Wishlist']")
    private WebElementFacade wishlistLink;
    @FindBy(id = "search")
    private WebElementFacade searchField;
    @FindBy(css = ".search-button")
    private WebElementFacade searchIcon;
    @FindBy(css = "#nav > ol > li.level0.nav-2.parent > ul > li.level1.nav-2-5.last")
    private WebElementFacade blazersCategory;

    public void clickAccountLink(){ /*waitFor(accountLink);*/ clickOn(accountLink); }

    public void clickLoginLink(){ clickOn(loginLink); }

    public void clickRegisterLink(){clickOn(registerLink);}

    public void clickWishlistLink(){clickOn(wishlistLink);}

    public void setSearchField(String text){typeInto(searchField,text);}

    public void clickSearchIcon(){clickOn(searchIcon); }

    public void clickManBlazersCategory(){clickOn(blazersCategory);}

}
