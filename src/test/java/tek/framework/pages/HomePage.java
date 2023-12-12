package tek.framework.pages;

import org.openqa.selenium.By;

public class HomePage {

    //Naming convention for Constants variable are all upper case with _ instead of space
    public static final By HOME_PAGE_TITLE = By.xpath("//div[@class='top-nav']/a");
    public static final By SING_IN_BUTTON = By.linkText("Sign in");
    public static final By ACCOUNT_BUTTON = By.linkText("Account");

}
