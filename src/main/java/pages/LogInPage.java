package pages;


import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver); //kada se extend-uje klasa, super omogucava koriscene "driver" u LoginPage iz BasePage-a, odnosno iz Parent klase. sta hoce da se koristi mora da se stavi u zagradu. U ovom slucaju nasledjuje iz BasePage driver sto znaci imace npr. timeout i find element
    }

    By usernameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By reactBurgetMenuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By addItemBy = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartBy = By.id("shopping_cart_container");
    By checkoutButtonBy = By.id("checkout");
    By firstNameTextFieldBy = By.id("first-name");
    By lastNameTextFieldBy = By.id("last-name");
    By zipTextFieldBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finalCheckoutButtonBy = By.id("finish");
    By removeItemButtonBy = By.id("remove-sauce-labs-backpack");

    String baseURL = PropertyManager.getInstance().getUrl();

    public LogInPage getURLToBasePage() {
        driver.get(baseURL);
        return this;
    }

    public LogInPage login(String username, String password) {
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    public LogInPage logout() {
        click(reactBurgetMenuButtonBy);
        click(logoutButtonBy);
        return this;
    }

    public LogInPage noUsernameTest(String password) {
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    public LogInPage noPasswordTest(String username) {
        writeText(usernameBy, username);
        click(loginButtonBy);
        return this;
    }
    public LogInPage purchaseItem() {
        click(addItemBy);
        click(shoppingCartBy);
        click(checkoutButtonBy);
        return this;
    }
    public LogInPage checkoutInformation(String firstName, String lastName, String zip){
        writeText(firstNameTextFieldBy, firstName);
        writeText(lastNameTextFieldBy, lastName);
        writeText(zipTextFieldBy, zip);
        click(continueButtonBy);
        return this;
    }
    public LogInPage finalizePurchase(){
        click(finalCheckoutButtonBy);
        return this;
    }
    public LogInPage removeItem(){
        click(addItemBy);
        click(shoppingCartBy);
        click(removeItemButtonBy);
        return this;
    }
}
