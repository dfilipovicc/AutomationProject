package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class EmptyUsernameFieldTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void emptyUsernameTest(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.noUsernameTest(PropertyManager.getInstance().getPassword());

        try{
            homePage.verifyNoUsername("Epic sadface: Username is required");
            System.out.print("Username missing");
        }catch(Exception e){
            Assert.fail("Username entered");
        }

    }
}
