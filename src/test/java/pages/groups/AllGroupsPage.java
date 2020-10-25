package pages.groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AllGroupsPage extends BasePage {

    @FindBy(xpath = ".//*[@class = 'o two-lines' and contains(@hrefattrs,'st._aid=UserGroups_MiniList_GroupPic1')]")
    List<WebElement> allGroups;

    public AllGroupsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGroupExist(String groupName) {
        waitForElementsToAppear(allGroups);
        return allGroups.stream()
                .filter(x -> x.getText().equals(groupName))
                .count() > 0;
    }

    public String getGroupHref(String groupName) {
        return allGroups.stream()
                .filter(x -> x.getText().equals(groupName))
                .findFirst()
                .get()
                .getAttribute("href");
    }
}
