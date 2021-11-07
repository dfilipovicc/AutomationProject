package tests;


import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class LoginTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void logIn(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.login(PropertyManager.getInstance().getUsername(), PropertyManager.getInstance().getPassword());

        try{
            homePage.verifyLogIn("LOGOUT");
            System.out.print("User is logged in");
        }catch (Exception e){
            Assert.fail("User is not logged in");
        }
    }






}
