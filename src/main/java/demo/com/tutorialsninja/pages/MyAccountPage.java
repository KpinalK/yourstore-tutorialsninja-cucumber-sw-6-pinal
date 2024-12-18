package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement regAccHeading;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement loginHeading;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement fNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement mobileField;


    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeCheckbox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement regConfirmMsg;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement contAfterRegButton;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement logoutConfirmMsg;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement afterLoginHeading;





    /**
     * This method will verify my account
     */

    public String verifyMyAccount(){
        log.info("vetify"+regAccHeading);
        return getTextFromElement(regAccHeading);
    }
    /**
     * This method will verify On Login Link
     */
    public String getRegAccHeading() {
        log.info("Get " + loginHeading.toString());
        return getTextFromElement(loginHeading);
    }
    /**
     * this method will fill up form
     */
    public void fillRegistrationData(String fName, String lName, String email, String mobile
            , String pwd, String cpwd) {
        sendTextToElement(fNameField, fName);
        sendTextToElement(lNameField, lName);
        sendTextToElement(emailField, email);
        sendTextToElement(mobileField, mobile);
        sendTextToElement(passwordField, pwd);
        sendTextToElement(confirmPasswordField, cpwd);
        clickOnElement(agreeCheckbox);
        clickOnElement(continueButton);
    }
    /**
     * This method will verify text
     */

    public String verifyConformMessage() {
        log.info("Get " + regConfirmMsg.toString());
        return getTextFromElement(regConfirmMsg);
    }
    /**
     * This method will continue after
     */
    public void clickOnContAfterRegButton() {
        clickOnElement(contAfterRegButton);
        log.info("Get " + contAfterRegButton.toString());
    }

    public String getLogoutConfirmMsg() {
        log.info("Get " + logoutConfirmMsg.toString());
        return getTextFromElement(logoutConfirmMsg);
    }

    /**
     * This method will login


     */

    public void fillLoginData(String email, String pwd) {
        sendTextToElement(emailField, email);
        sendTextToElement(passwordField, pwd);
        clickOnElement(loginButton);
    }
    public String getAfterLoginHeading() {
        log.info("Get " + afterLoginHeading.toString());
        return getTextFromElement(afterLoginHeading);
    }

}
