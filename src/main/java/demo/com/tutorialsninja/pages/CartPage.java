package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

public class CartPage extends Utility {

    private static final Logger log = LogManager.getLogger(CartPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartHeading;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[@class='text-left'][2]")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement qtyTextBox;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement updateQtyButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successCartUpdateMsg;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOutButton;




    /**
     * This method will verify Shopping cart text "Shopping Cart"
     */
    public String getShoppingCartHeading() {
        log.info("Get " + shoppingCartHeading.toString());
        return getTextFromElement(shoppingCartHeading);
    }



    /**
     * This method will verifyProdctName
     */
    public String getProductName() {
        log.info("Get " + productName.toString());
        return getTextFromElement(productName);
    }

    /**
     * This method will verify model
     */
    public String getModelName() {
        log.info("Get " + modelName.toString());
        return getTextFromElement(modelName);
    }

    /**
     * This method will verify price
     */
    public String getTotalPrice() {
        log.info("Get " + totalPrice.toString());
        WebElement toRightOf = driver.findElement(RelativeLocator.with(By.xpath("//td[@class='text-right']")).toRightOf(By.xpath("//strong[normalize-space()='Total:']")));

        return getTextFromElement(toRightOf);
    }
    /**
     * This method will change qty
     */
    public void sendQty(String qty) {
        log.info("click " + qtyTextBox.toString());
        qtyTextBox.clear();
        sendTextToElement(qtyTextBox, qty);
    }

    /**
     * This method will update qty
     */
    public void clickOnUpdateQty() {
        clickOnElement(updateQtyButton);
        log.info("click " + qtyTextBox.toString());
    }
    /**
     * This method will verify success message
     */
    public String getSuccessCartUpdateMsg() {
        log.info("get " + successCartUpdateMsg.toString());
        return getTextFromElement(successCartUpdateMsg);
    }
    /**
     * This method will click on cheak out button
     */
    public void clickOnCheckOut() {
        log.info("click on " + checkOutButton.toString());
        clickOnElement(checkOutButton);
    }
}
