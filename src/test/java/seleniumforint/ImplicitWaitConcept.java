package seleniumforint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe"); // check if its there if not change place as its removing by system
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // waiting for max 40 page load, if loaded with 5 sec, then its ignoring rest of seconds
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // waiting after page load for all elements loading

        // thread.sleep is opposite - hard set time - if 30 sec then it will wait 30 sec?
    }
}
