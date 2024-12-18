package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsSteps {
    @When("I click on my accounts link")
    public void iClickOnMyAccountsLink() {
        new HomePage().selectMyAccountOptions("My Account");
    }

    @And("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().selectMyAccountOptions("Register");
    }

    @Then("Verify the text {string}")
    public void verifyTheText(String heading) {
        Assert.assertEquals(new MyAccountPage().verifyMyAccount(),heading,"Invalid heading");
    }

    @And("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().selectMyAccountOptions("Login");
    }

    @Then("Verify the login text {string}")
    public void verifyTheLoginText(String verifyText) {
        Assert.assertEquals(new MyAccountPage().getRegAccHeading(), verifyText, "Register page navigation failed");
    }

    @And("I register to ac using data: {string}, {string}, {string}, {string}, {string}, {string}")
    public void iRegisterToAcUsingData(String firstName, String lastNAme, String email, String mobile, String password, String conformPassword) {
        new MyAccountPage().fillRegistrationData(firstName,lastNAme,email,mobile,password,conformPassword);
    }

    @Then("Verify the Message Your Account Has Been Created!")
    public void verifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountPage().verifyConformMessage(), "Your Account Has Been Created!", "Reg success msg not displayed");
    }

    @And("I click on continue button after register")
    public void iClickOnContinueButtonAfterRegister() {
        new MyAccountPage().clickOnContAfterRegButton();
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new HomePage().selectMyAccountOptions("Logout");
    }

    @Then("Verify the logout text {string}")
    public void verifyTheLogoutText(String text) {
        Assert.assertEquals(new MyAccountPage().getLogoutConfirmMsg(), text, "Logout confirmation not displayed");
    }

    @And("I enter {string}, {string} and login")
    public void iEnterAndLogin(String email, String password) {
        new MyAccountPage().fillLoginData(email, password);
    }

    @Then("Verify text afcter login {string}")
    public void verifyTextAfcterLogin(String text) {
        Assert.assertEquals(new MyAccountPage().getAfterLoginHeading(), text, "My Account");
    }
}
