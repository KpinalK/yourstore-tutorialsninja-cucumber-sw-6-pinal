package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustHeading;


    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestRadio;

    @CacheLookup
    @FindBy(id = "button-account")
    WebElement checkoutOptContButton;

    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement fNameField;

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lNameField;

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement mobileField;

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address1Field;

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcodeField;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement stateField;

    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement billingDetailsContButton;

    @CacheLookup
    @FindBy(id = "button-shipping-method")
    WebElement delMethodContButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeTermsCheckbox;

    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement paymentMethodContButton;





    /**
     * This method will new customer heading
     */
    public String getNewCustHeading() {
        log.info("Get " + newCustHeading.toString());
        return getTextFromElement(newCustHeading);
    }
    /**
     * This method will click on radio
     */
    public void clickOnGuestRadio() {
        log.info("click on " + guestRadio.toString());
        clickOnElement(guestRadio);
    }
    /**
     * This method will clicl on Continue button
     */

    public void clickOnContinueButton(){
        clickOnElement(checkoutOptContButton);
        log.info("click"+checkoutOptContButton.toString());
    }
    /**
     * This method will detail
     */
    public void fillBillingFormDetails(String fName, String lName, String email, String mobile
            , String add1, String city, String postCode, String country, String state) {
        sendTextToElement(fNameField, fName);
        sendTextToElement(lNameField, lName);
        sendTextToElement(emailField, email);
        sendTextToElement(mobileField, mobile);
        sendTextToElement(address1Field, add1);
        sendTextToElement(cityField, city);
        sendTextToElement(postcodeField, postCode);
        selectByVisibleTextFromDropDown(countryField, country);
        selectByVisibleTextFromDropDown(stateField, state);
        clickOnElement(billingDetailsContButton);
    }
    /**
     * This method will del method continue btn

     */
    public void clickOnDelMethodContButton() {
        log.info("click on " + delMethodContButton.toString());
        clickOnElement(delMethodContButton);
    }
    /**
     * This method will click on terms condition
     */
    public void clickOnAgreeTermsCheckbox() {
        log.info("click on " + agreeTermsCheckbox.toString());
        clickOnElement(agreeTermsCheckbox);
    }
    /**
     * This method will click On payment
     */
    public void clickOnPaymentMethodCont() {
        log.info("click on " + paymentMethodContButton.toString());
        clickOnElement(paymentMethodContButton);
    }
}
