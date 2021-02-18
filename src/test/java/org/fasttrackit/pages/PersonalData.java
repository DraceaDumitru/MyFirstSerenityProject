package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=119")
public class PersonalData extends PageObject {
    @FindBy(css = "#billing_first_name")
    private WebDriver first_name;

    @FindBy(css = "#billing_last_name")
    private WebDriver last_name;

    @FindBy(css = "#billing_address_1")
    private WebDriver address;

    @FindBy(css = "#billing_city")
    private WebDriver city;

    @FindBy(css = "#billing_postcode")
    private WebDriver ZIP;

    @FindBy(css = "#billing_phone")
    private WebDriver phone;

    public void set_FirstName(String firstName){
        typeInto((WebElement) first_name,firstName);
    }
    public void set_Last_name(String lastName){typeInto((WebElement) last_name,lastName);}
    public void set_Address(String address_field){typeInto((WebElement) address,address_field);}
    public void set_City(String city_field){typeInto((WebElement)city,city_field);}
    public void set_ZIP(String zip_code){typeInto((WebElement)ZIP,zip_code);}
    public void set_phone(String phone_nr){typeInto((WebElement) phone,phone_nr);}

    public static final String FIRST_NAME = "Dracea";
    public static final String LAST_NAME = "Dumitru";
    public static final String ADDRESS ="strada teiului , nr 10";
    public static final String CITY ="Brasov";
    public static final String ZIP_CODE ="061003";
    public static final String PHONE ="0722822911";

}
