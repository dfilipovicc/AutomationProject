package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    //deklaracija varijabla
    private static String driverPath;
    private static String url;
    private static String username;
    private static String bad_login_password;
    private static String password;
    private static String firstName;
    private static String lastName;
    private static String zip;

    public static PropertyManager getInstance(){
        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new
            FileInputStream("src/main/resources/configuration.properties");
            prop.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //putanja ka varijabli
        driverPath = prop.getProperty("driverPath");
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        bad_login_password = prop.getProperty("bad_login_password");
        password = prop.getProperty("password");
        firstName = prop.getProperty("firstName");
        lastName = prop.getProperty("lastName");
        zip = prop.getProperty("zip");
        return instance;
    }
        //metode
        public String getDriverPath(){
        return driverPath;
        }
        public String getUrl(){
        return url;
        }
        public String getUsername(){
        return username;
        }
        public String getBadLoginPassword(){
        return bad_login_password;
        }
        public String getPassword(){
        return password;
        }
        public String getFirstName(){
        return firstName;
        }
        public String getLastName(){
        return lastName;
        }
        public String getZip(){
        return zip;
        }
}
