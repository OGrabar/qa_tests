package tests.login;

import bots.Bot;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import pages.login.LoginPage;
import tests.BaseTest;

public class LoginTest extends BaseTest {
    protected Bot bot;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage(driver);
    }

    @Step("Try to sign in")
    protected void login(String login, String password) {
        loginPage.login(login, password);
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }
}
