package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//li//a")
    List<WebElement> topMenu;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement deskTopLink;


    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement deskTopMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsAndNoteLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement componentsLink;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
    WebElement laptopsAndNoteHeading;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Components']")
    WebElement componentsHeading;


    /**
     * This method will select menu
     */
    public void selectMenu(String menu) {
        List<WebElement> topMenuElements = topMenu;
        for (WebElement e : topMenuElements) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    /**
     * This method will deskTopLink And click
     */
    public void mouseHoverOnDesktopAndClick() {
        mouseHoverToElementAndClick(deskTopLink);
        log.info("click On " + deskTopLink.toString());
    }

    /**
     * This method will deskTop heading
     */
    public String deskTopMessage() {
        log.info("get " + deskTopMessage.toString());
        return getTextFromElement(deskTopMessage);
    }

    /**
     * This method will mouseHover LapTopAndClick
     */

    public void mouseHoverOnLaptopsAndNotebookAndClick() {
        mouseHoverToElementAndClick(laptopsAndNoteLink);
        log.info("Click on " + laptopsAndNoteLink.toString());
    }

    /**
     * This method will laptop and book heading
     */

    public String laptopANdNotebookHeading() {
        log.info("get " + laptopsAndNoteHeading.toString());
        return getTextFromElement(laptopsAndNoteHeading);
    }

    /**
     * This method will mouseHover on components and click
     */

    public void mouseHoverOnComponentsAndClick() {
        mouseHoverToElementAndClick(componentsLink);
        log.info("Click on " + componentsLink.toString());
    }

    /**
     * This method will comopents text
     */

    public String componentsHeading() {
        log.info("get " + componentsHeading.toString());
        return getTextFromElement(componentsHeading);
    }
}
