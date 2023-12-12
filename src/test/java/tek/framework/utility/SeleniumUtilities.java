package tek.framework.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.framework.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }
    private WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public String getElementText(By locator) {
        WebElement element= waitForVisibility(locator);
        return element.getText();
    }

    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();
    }

    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendText(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    public boolean isElementDisplayed(By locator) {
       return waitForVisibility(locator).isDisplayed();
    }
}
