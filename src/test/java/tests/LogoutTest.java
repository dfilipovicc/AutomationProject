package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class LogoutTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void logIn(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.login(PropertyManager.getInstance().getUsername(), PropertyManager.getInstance().getPassword());
        logInPage.logout();

        try {
            homePage.verifyLogout("");
            System.out.print("User is logged out");
        }catch (Exception e){
            Assert.fail("User is still logged in");
        }
        }

}
