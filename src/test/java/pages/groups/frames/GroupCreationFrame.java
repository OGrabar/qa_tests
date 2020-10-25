package pages.groups.frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class GroupCreationFrame extends BasePage {

    @FindBy(xpath = ".//*[contains(@href,'st.layer.tile=INTEREST')]")
    private WebElement groupByInterests;

    public GroupCreationFrame(WebDriver driver) {
        super(driver);
    }

    public void createGroupByInterests(String groupName) {
        waitForElementsToAppear(List.of(groupByInterests));
        groupByInterests.click();
        new GroupByInterestSetInfoFrame(driver)
                .createGroupByInterests(groupName);
    }


}
