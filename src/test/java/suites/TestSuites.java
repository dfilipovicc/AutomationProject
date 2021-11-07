package suites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LoginTest.class,
        LogoutTest.class,
        EmptyUsernameFieldTest.class,
        EmptyPasswordFieldTest.class,
        WrongCredentialsLoginTest.class,
        PurchaseItemTest.class,
        RemoveItemFromBasketTest.class,

})
public class TestSuites {


}
