package tests.login;

import bots.Bot;
import bots.TechoBot5;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FailedLoginTest extends LoginTest {
    @Test
    @Owner(value = "O.Grabar")
    @Severity(value = SeverityLevel.BLOCKER)
    @Description(value = "Testing log in")
    @Epic(value = "Log in tests")
    @Story(value = "Incorrect login and password")
    public void loginTest() {
        bot = new TechoBot5();
        login("incorrect" + bot.getLogin(), bot.getPassword());
        Assert.assertFalse(loginPage.isLoginSuccessful(bot.getName()));
    }

}
