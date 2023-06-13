package seleniumforint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigations {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        //driver.get("https://www.amazon.com/"); // seems acting same as navigate to even by using back and forward after it
       driver.navigate().to("https://www.amazon.com/"); // using to switch to another url from initial, even if get works same

       //back and forward button simulation
        driver.navigate().back();

       //     Thread.sleep(2000); // 2 sec
       driver.navigate().forward();
       driver.navigate().refresh(); // refreshing page
        driver.quit();
    }
}
