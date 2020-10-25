package tests.groups;

import bots.TechoBot6;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.groups.GroupMainPage;

public class CreateNewGroupByInterestsTest extends GroupTest{

    private static final String GROUP_NAME = "Test group";

    @Test
    @Owner("O.Grabar")
    @Severity(value = SeverityLevel.MINOR)
    @Description("Creation test group by interest")
    @Epic("Group tests")
    @Story("Creation group by interest without category, open access, and valid name")
    public void test() {
        bot = new TechoBot6();
        login();
        toGroupsPage();
        createGroupByInterest();
        Assert.assertTrue(groupsPage.getUserAllGroupsPage().isGroupExist(GROUP_NAME));
    }

    @Step("Create group")
    private void createGroupByInterest() {
        groupsPage.createNewGroupByInterest(GROUP_NAME);
    }


    @AfterClass
    public void afterClass() {
        String groupHref = groupsPage.getUserAllGroupsPage().getGroupHref(GROUP_NAME);
        new GroupMainPage(driver).deleteGroup(groupHref);
        driver.quit();
    }
}
