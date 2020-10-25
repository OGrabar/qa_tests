package tests.login;


import bots.Bot;
import bots.TechoBot5;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SuccessLoginTest extends LoginTest {

    @Test
    @Owner(value = "O.Grabar")
    @Severity(value = SeverityLevel.BLOCKER)
    @Description(value = "Testing log in")
    @Epic(value = "Log in tests")
    @Story(value = "Correct login and password")
    public void loginTest() {
        bot = new TechoBot5();
        login(bot.getLogin(), bot.getPassword());
        Assert.assertTrue(loginPage.isLoginSuccessful(bot.getName()));
    }


}
