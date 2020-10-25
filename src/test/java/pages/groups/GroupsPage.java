package pages.groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.groups.frames.GroupCreationFrame;
import pages.user.MainPage;

import java.util.List;

public class GroupsPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@href,'st.layer.cmd=PopLayerCreateAltGroup')]")
    private WebElement createGroupButton;

    @FindBy(xpath = ".//*[contains(@hrefattrs,'GroupsSubMenu_User_MyGroupsNav_All')]")
    private WebElement allGroups;

    public GroupsPage(WebDriver driver) {
        super(driver);
    }

    public void createNewGroupByInterest(String groupName) {
        waitForElementsToAppear(List.of(createGroupButton));
        createGroupButton.click();
        GroupCreationFrame creationFrame = new GroupCreationFrame(driver);
        creationFrame.createGroupByInterests(groupName);
    }

    public AllGroupsPage getUserAllGroupsPage() {
        driver.get(OK_RU);
        new MainPage(driver).getGroupsPage();
        waitForElementsToAppear(List.of(allGroups));
        allGroups.click();
        return new AllGroupsPage(driver);
    }
}
