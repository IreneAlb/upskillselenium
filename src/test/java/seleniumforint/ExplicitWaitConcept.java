package seleniumforint;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static scala.util.control.Exception.ignoring;

public class ExplicitWaitConcept {
    static public WebDriver driver;

// explicit wait for specific element not for all, so waiting 1 time
    public static void main(String[] args) {
        //waiting for element loading, as if not elements will be element npt found exception
        // page fully loaded is not guarantee that all elements are fully loaded
       // System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
   // driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
       driver.findElement(By.id("L2AGLb")).click();

     //  clickOn(driver,driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a/span")),Duration.ofSeconds(20)); // if element will be visible in 2 seconds, then rest 18 seconds will be ignored
       // clickOn(driver,driver.findElement(By.xpath("//a[contains(text(),'Zaloguj się')]")),Duration.ofSeconds(20));
        clickOn(driver,driver.findElement(By.className("gb_Kd")),Duration.ofSeconds(20)); // login button
        clickOn(driver,driver.findElement(By.linkText("Więcej informacji")),Duration.ofSeconds(10)); // more info button

    }
// special method used to click for any element like buttons, links, elementc etc - just call it in main method as above
    // will not work for dropdown
    public static void clickOn(WebDriver driver, WebElement locator, Duration timeout){
        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        // after until there many methods like element to be visible etc.
        // new object of WebdriverWait class is created
        locator.click();
    }
}
