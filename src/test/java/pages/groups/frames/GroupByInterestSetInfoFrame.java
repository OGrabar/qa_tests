package pages.groups.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class GroupByInterestSetInfoFrame extends BasePage {

    private static final By NAME_FIELD = By.id("field_name");

    @FindBy(id = "hook_FormButton_button_create")
    private WebElement createButton;

    public GroupByInterestSetInfoFrame(WebDriver driver) {
        super(driver);
    }

    public void createGroupByInterests(String groupName) {
        WebElement nameField = driver.findElement(NAME_FIELD);
        List<WebElement> necessaryElements = List.of(nameField, createButton);
        waitForElementsToAppear(necessaryElements);
        nameField.clear();
        nameField.sendKeys(groupName);
        createButton.click();
    }
}
