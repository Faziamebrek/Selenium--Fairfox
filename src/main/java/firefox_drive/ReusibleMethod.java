package firefox_drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusibleMethod {
    public static void appBrowser(String browser) {
        if (browser.equals("chrome")){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.walmart.com/");
        } else if (browser.equals("firefox")) {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.walmart.com/");
        } else if (browser.equals("edge")) {
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.walmart.com/");

    }

    }

    public static void main(String[] args) {
        ReusibleMethod.appBrowser("firefox");
    }
}

