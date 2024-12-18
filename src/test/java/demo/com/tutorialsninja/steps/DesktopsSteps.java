package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.CartPage;
import demo.com.tutorialsninja.pages.DeskTopPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class DesktopsSteps {
    @And("I Select Sort By position Name \\(Z to A)")
    public void iSelectSortByPositionNameZToA() {
        new DeskTopPage().selectFromSortByDropdown("Name (Z - A)");
    }

    @Then("I Verify the Product will arrange in Descending order.")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
        List<String> actualList = new DeskTopPage().getSortedProductList();
        List<String> expectedList = new DeskTopPage().expectedList();
        Assert.assertEquals(actualList, expectedList, "Products not sorted in descending order");
    }

    @When("I mouse hover and click on currency dropdown and pound sterling")
    public void iMouseHoverAndClickOnCurrencyDropdownAndPoundSterling() {
        new HomePage().selectPoundCurrency();
    }

    @And("I Select Sort By position Name \\(A to Z)")
    public void iSelectSortByPositionNameAToZ() {
        new DeskTopPage().selectFromSortByDropdown("Name (A - Z)");
    }

    @And("I select {string}")
    public void iSelect(String product) {
        new DeskTopPage().clickOnProduct(product);
    }

    @Then("Verify text {string}")
    public void verifyText(String productName) {
        new ProductPage().verifyProductText();
        Assert.assertEquals(new ProductPage().verifyProductText(), productName, "product name doesn't match");
    }

    @And("I enter qty {string}")
    public void iEnterQty(String qty) {
        new ProductPage().enterQty(qty);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("Verify the Message Success: You have added {string} to your shopping cart!")
    public void verifyTheMessageSuccessYouHaveAddedToYourShoppingCart(String product) {
        Assert.assertEquals(new ProductPage().verifySuccessMessage(), "Success: You have added " + product + " to your shopping cart!\n" + "×");
    }

    @And("I click on link shopping cart into message")
    public void iClickOnLinkShoppingCartIntoMessage() {
        new ProductPage().clickOnLinkCart();
    }

    @Then("Verify Shopping cart text {string}")
    public void verifyShoppingCartText(String text) {
        Assert.assertEquals(new CartPage().getShoppingCartHeading().substring(0,13), text, "Navigation to shopping cart page failed");
    }

    @Then("Verify the Product name {string}")
    public void verifyTheProductName(String productName) {
        Assert.assertEquals(new CartPage().getProductName(), productName, "Product name not valid");
    }

    @Then("Verify the Model {string}")
    public void verifyTheModel(String modelName) {
        Assert.assertEquals(new CartPage().getModelName(), modelName, "Model name not valid");
    }

    @Then("Verify the Total {string}")
    public void verifyTheTotal(String price) {
        Assert.assertEquals(new CartPage().getTotalPrice(), price, "Total not valid");
    }
}
