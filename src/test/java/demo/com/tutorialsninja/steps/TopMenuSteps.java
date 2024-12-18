package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover and click on desktop link")
    public void iMouseHoverAndClickOnDesktopLink() {
        new TopMenuPage().mouseHoverOnDesktopAndClick();
    }

    @And("I click on show all desktops link")
    public void iClickOnShowAllDesktopsLink() {
        new TopMenuPage().selectMenu("Show AllDesktops");
    }

    @Then("I Verify Desktops text")
    public void iVerifyDesktopsText() {
        Assert.assertEquals(new TopMenuPage().deskTopMessage(), "Desktops");
    }

    @When("I mouse hover and click on laptops and notebooks link")
    public void iMouseHoverAndClickOnLaptopsAndNotebooksLink() {
        new TopMenuPage().mouseHoverOnLaptopsAndNotebookAndClick();
    }

    @And("I click on Show all laptops and notebooks link")
    public void iClickOnShowAllLaptopsAndNotebooksLink() {
        new TopMenuPage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("I Verify Laptops & Notebooks text")
    public void iVerifyLaptopsNotebooksText() {
        Assert.assertEquals(new TopMenuPage().laptopANdNotebookHeading(), "Laptops & Notebooks");
    }

    @When("I mouse hover and click on components link")
    public void iMouseHoverAndClickOnComponentsLink() {
        new TopMenuPage().mouseHoverOnComponentsAndClick();
    }

    @And("I click on Show all components link")
    public void iClickOnShowAllComponentsLink() {
        new TopMenuPage().selectMenu("Show AllComponents");
    }

    @Then("I Verify Components text")
    public void iVerifyComponentsText() {
        Assert.assertEquals(new TopMenuPage().componentsHeading(), "Components");
    }
}
