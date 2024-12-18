package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.CartPage;
import demo.com.tutorialsninja.pages.CheckoutPage;
import demo.com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class LaptopsAndNotbooksSteps {
    @And("I select Sort By position Price \\(High > Low)")
    public void iSelectSortByPositionPriceHighLow() {
        new LaptopsAndNoteBooksPage().selectFromSortByDropdown("Price (High > Low)");

    }

    @Then("Verify the product arrange in high to low order")
    public void verifyTheProductArrangeInHighToLowOrder() {
        List<Double> expectedList = new LaptopsAndNoteBooksPage().priceHighToLow();
        List<Double> actualList = new LaptopsAndNoteBooksPage().getPriceHighToLow();
        Assert.assertEquals(actualList, expectedList);
    }

    @And("I change qty to {string}")
    public void iChangeQtyTo(String qty) {
        new CartPage().sendQty(qty);
    }

    @And("I click on update qty button")
    public void iClickOnUpdateQtyButton() {
        new CartPage().clickOnUpdateQty();
    }

    @Then("Verify the Message Success: You have modified your shopping cart!")
    public void verifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new CartPage().getSuccessCartUpdateMsg(), "Success: You have modified your shopping cart!\n"+"×", "Cart modification failed");
    }

    @And("I click on checkout button")
    public void iClickOnCheckoutButton() {
        new CartPage().clickOnCheckOut();
    }

    @Then("Verify {string} heading")
    public void verifyHeading(String verifyHeading) {
        Assert.assertEquals(new CheckoutPage().getNewCustHeading(), verifyHeading, "New customer not displayed");
    }

    @And("I click on guest checkout radio")
    public void iClickOnGuestCheckoutRadio() {
        new CheckoutPage().clickOnGuestRadio();
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("I fill billing form details; {string},{string},{string},{string},{string}, {string}, {string}, {string},{string}")
    public void iFillBillingFormDetails(String firstName, String lastName, String email, String mobile, String address, String city, String postCode, String country, String state) {
        new CheckoutPage().fillBillingFormDetails(firstName,lastName,email,mobile,address,city,postCode,country,state);
    }

    @And("I click on del method continue btn")
    public void iClickOnDelMethodContinueBtn() {
        new CheckoutPage().clickOnDelMethodContButton();
    }

    @And("I click on agree terms checkbox")
    public void iClickOnAgreeTermsCheckbox() {
        new CheckoutPage().clickOnAgreeTermsCheckbox();
    }

    @And("I click on payment method continue btn")
    public void iClickOnPaymentMethodContinueBtn() {
        new CheckoutPage().clickOnPaymentMethodCont();
    }
}
