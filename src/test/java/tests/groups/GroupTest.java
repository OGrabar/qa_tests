package tests.groups;

import bots.Bot;
import io.qameta.allure.Step;
import pages.groups.GroupsPage;
import pages.login.LoginPage;

import pages.user.MainPage;
import tests.BaseTest;


public class GroupTest extends BaseTest {

    protected Bot bot;
    protected GroupsPage groupsPage;

    @Step("Sign in")
    protected void login() {
        new LoginPage(driver).login(bot.getLogin(), bot.getPassword());
    }

    @Step("Go the groups page")
    protected void toGroupsPage() {
        groupsPage = new MainPage(driver).getGroupsPage();
    }

}
