package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.groups.GroupsPage;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//*[@class='nav-side_i  __with-ic' and contains(@href,'groups')]")
    private WebElement groups;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public GroupsPage getGroupsPage() {
        List<WebElement> necessaryElements = List.of(groups);
        waitForElementsToAppear(necessaryElements);
        groups.click();
        return new GroupsPage(driver);
    }

}
