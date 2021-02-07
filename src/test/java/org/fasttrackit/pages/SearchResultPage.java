package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy(css = ".category-products .item.last")
    private List<WebElementFacade> productList;

    public boolean isProductDisplayed(String productName) {
        for (WebElementFacade webElementFacade : productList) {
            if (webElementFacade.findElement(By.cssSelector(".product-name")).getText().equals(productName)) {
                return true;
            }
        }
        return false;
    }
    public boolean isProductPriceDisplayed(String productPrice) {
        for (WebElementFacade webElementFacade : productList) {
            if (webElementFacade.findElement(By.cssSelector("#old-price-403")).getText().equals(productPrice)) {
                return true;
            }
        }
        return false;
    }
}
