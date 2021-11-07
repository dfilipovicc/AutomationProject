package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class WrongCredentialsLoginTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void wrongCredentialsLogin(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.login(PropertyManager.getInstance().getUsername(),
                        PropertyManager.getInstance().getBadLoginPassword());
       try {
           homePage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service");
           System.out.print("User is not logged in");
       }catch (Exception e) {
           Assert.fail("User is logged in");
       }
    }
}
