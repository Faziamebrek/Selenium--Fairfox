package firefox_drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium4 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://my.smccd.edu/canvas/");
    }
}
