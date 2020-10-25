package pages.groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class GroupMainPage extends BasePage {

    @FindBy(xpath = ".//*[@class = 'u-menu_a toggle-dropdown']")
    private WebElement actionMenu;

    @FindBy(xpath = ".//*[contains(@hrefattrs, 'cmd=PopLayer&st.layer.cmd=PopLayerRemoveAltGroup')]")
    private WebElement delete;

    @FindBy(id = "hook_FormButton_button_delete")
    private WebElement confirmDelete;

    public GroupMainPage(WebDriver driver) {
        super(driver);
    }

    public void deleteGroup(String groupHref) {
        driver.get(groupHref);
        waitForElementsToAppear(List.of(actionMenu));
        actionMenu.click();
        waitForElementsToAppear(List.of(delete));
        delete.click();
        waitForElementsToAppear(List.of(confirmDelete));
        confirmDelete.click();
    }

}
