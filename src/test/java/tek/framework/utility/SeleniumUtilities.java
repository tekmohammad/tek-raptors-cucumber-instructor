package tek.framework.utility;

import org.openqa.selenium.By;
import tek.framework.base.BaseSetup;

public class SeleniumUtilities extends BaseSetup {

    public String getElementText(By locator) {
        String text = getDriver().findElement(locator).getText();
        return text;
    }

    public boolean isElementEnabled(By locator) {
        return getDriver().findElement(locator).isEnabled();
    }
}
