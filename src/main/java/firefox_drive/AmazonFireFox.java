package firefox_drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class AmazonFireFox {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +
                File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

    }

}
