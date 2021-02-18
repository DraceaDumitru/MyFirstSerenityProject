package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {
    @FindBy(css = "a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElementFacade item_1;

    public void first_item(){clickOn(item_1);}
}
