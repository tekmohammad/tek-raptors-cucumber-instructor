package tek.framework.pages;

import org.openqa.selenium.By;

//Elements for Login Page Only using By Approach
public class LoginPage {

    public static final By USERNAME_INPUT = By.name("email");
    public static final By PASSWORD_INPUT = By.name("password");

    public static final By LOGIN_BUTTON = By.id("loginBtn");

    public static final By ERROR_MESSAGE = By.className("error");
    public static final By CREATE_NEW_ACCOUNT_LINK = By.linkText("Create New Account");
}
