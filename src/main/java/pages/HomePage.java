package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    By errorNotificationBy = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"); //probati xpath
    By reactBurgerMenuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By loginButtonBy = By.id("login-button");
    By finishPurchaseBy = By.className("complete-header");

    public HomePage verifyFailedLogin(String expectedText){
        String error_message_container_error = readText(errorNotificationBy); //ne moramo da pravimo objekat klase zato sto je BasePage nasledjen, znaci koristimo sve iz BasePage
        assertStringEquals(error_message_container_error, expectedText);
        return this; //return this vraca objekat klase
     }
    public HomePage verifyLogIn(String expectedText){
        click(reactBurgerMenuButtonBy);
        String logout = readText(logoutButtonBy);
        assertStringEquals(logout, expectedText);
        return this;
    }
    public HomePage verifyLogout(String expectedText){
        String loggedOut = readText(loginButtonBy);
        assertStringEquals(loggedOut, expectedText);
        return this;
    }
    public HomePage verifyNoUsername(String expectedText){
        String noUsername = readText(errorNotificationBy);
        assertStringEquals(noUsername, expectedText);
        return this;
    }
    public HomePage verifyNoPassword(String expectedText){
        String noPassword = readText(errorNotificationBy);
        assertStringEquals(noPassword, expectedText);
        return this;
    }
    public HomePage verifyPurchase(String expectedText){
        String purchase = readText(finishPurchaseBy);
        assertStringEquals(purchase, expectedText);
        return this;
    }
    }

