package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.user.MainPage;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(name = "st.email")
    private WebElement emailField;

    @FindBy(name = "st.password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value = 'Войти в Одноклассники']")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginSuccessful(String name) {
        By nameBox = By.xpath("//div[contains(text(), '" + name + "')]");
        return isElementPresent(nameBox);
    }

    public MainPage login(String login, String password) {
        driver.get(OK_RU);
        List<WebElement> necessaryElements = List.of(emailField, passwordField, submitButton);
        waitForElementsToAppear(necessaryElements);
        emailField.clear();
        passwordField.clear();
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        submitButton.click();
        return new MainPage(driver);
    }


}
