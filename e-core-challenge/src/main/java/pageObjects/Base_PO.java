package pageObjects;

import Driver.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Variables;
import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Base_PO {
    public Base_PO() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }


    public void navigateTo_URL(String url) {
        getDriver().get(url);
    }


    public void sendKeys(WebElement element, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }

    public void waitForWebElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.PAGE_LOAD_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void isElementPresent(String xpathWebElement) {
        try{
            if (getDriver().findElement(By.xpath(xpathWebElement)).isDisplayed()) {
                System.out.println("Element found");
            }
        } catch(Exception e){
            assert false;
            e.printStackTrace();
        }
    }

    public void waitForListToBeVisible(List<WebElement> list) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
    }

    public void waitForWebElementAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void checkListIsNotEmpty(List<WebElement> list) {
        if (list.isEmpty()) {
            throw new NullPointerException(toString());
        }
    }

    public void clickFirstElementList(List<WebElement> listElements) {
        waitForListToBeVisible(listElements);
        checkListIsNotEmpty(listElements);
        listElements.get(0).click();
    }

    public void assertWebElementString(String expectedText, WebElement element) {
        waitForWebElementToBeVisible(element);
        Assert.assertEquals(expectedText, element.getText().trim());
    }

    public void assertWebElementValue(String expectedValue, WebElement element) {
        waitForWebElementToBeVisible(element);
        Assert.assertEquals(expectedValue, element.getText().replaceAll("\\D", "").trim());
    }

    public void assertDate(String expectedValue, WebElement element) {
        waitForWebElementToBeVisible(element);
        Pattern pattern = Pattern.compile("[0-9/]+");
        Matcher matcher = pattern.matcher(element.getText());
        matcher.find();
        Assert.assertEquals(expectedValue, matcher.group());
        System.out.println(matcher.group());
    }

    public void assertWebElementTrimmedStrings(String expectedText, WebElement element) {
        waitForWebElementToBeVisible(element);
        Assert.assertEquals(expectedText.replaceAll("\\s+", ""), element.getText().replaceAll("\\s+", ""));
    }

    public void clickFirstElementListAndSwitchToNewTab(List<WebElement> element) {
        //get the current tab and store it in a variable
        String originalWindow = getDriver().getWindowHandle();

        //makes sure that only one tab is presented
        assert getDriver().getWindowHandles().size() == 1;

        //click on the first invoice details link
        clickFirstElementList(element);

        //waits until the number of tabs opened is 2
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.PAGE_LOAD_EXPLICIT_TIMEOUT));
        wait.until(numberOfWindowsToBe(2));

        // Loop through until find a new window handle and then switch to it
        for (String windowHandle : getDriver().getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }

}
