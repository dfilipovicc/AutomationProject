package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class RemoveItemFromBasketTest extends BaseTest{
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void purchaseItemTest(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.login(PropertyManager.getInstance().getUsername(), PropertyManager.getInstance().getPassword());
        logInPage.removeItem();
}}
