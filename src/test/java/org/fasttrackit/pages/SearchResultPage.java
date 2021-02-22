package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy(css = "")
    private List<WebElementFacade> productList;

    public boolean is_Product_Displayed(String productName) {
        for (WebElementFacade webElementFacade : productList) {
            if (webElementFacade.findElement(By.cssSelector(".header-icons-wrap input[value=‘Search’] ")).getText().equals(productName)) {
                return true;
            }
        }
        return false;
    }
    public boolean is_Product_Price_Displayed(String productPrice) {
        for (WebElementFacade webElementFacade : productList) {
            if (webElementFacade.findElement(By.cssSelector("#azera_shop_id_5XNDGtIpy7 > div.azera_shop_grid_col_4.azera_shop_grid_column_4.azera_shop_grid_last > li.post-58.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories-clothing.last.outofstock.sale.taxable.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > span.price > ins > span")).getText().equals(productPrice)) {
                return true;
            }
        }
        return false;
    }
}
