package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class EmptyPasswordFieldTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void emptyPasswordFieldTest(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.noPasswordTest(PropertyManager.getInstance().getUsername());

        try{
            homePage.verifyNoPassword("Epic sadface: Password is required");
            System.out.print("Password missing");
        }catch(Exception e){
            Assert.fail("Password entered");
        }

    }
}
