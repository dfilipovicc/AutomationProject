package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class PurchaseItemTest extends BaseTest{
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void purchaseItemTest(){
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.getURLToBasePage();
        logInPage.login(PropertyManager.getInstance().getUsername(), PropertyManager.getInstance().getPassword());
        logInPage.purchaseItem();
        logInPage.checkoutInformation(PropertyManager.getInstance().getFirstName(),
                                        PropertyManager.getInstance().getLastName(),
                                        PropertyManager.getInstance().getZip());
        logInPage.finalizePurchase();

        try{
            homePage.verifyPurchase("THANK YOU FOR YOUR ORDER");
            System.out.print("You have successfully purchased an item");
        }catch (Exception e){
            Assert.fail("You have failed");
        }



    }


}
