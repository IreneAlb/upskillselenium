package seleniumforint;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenshot {
    public static void main(String[] args)  throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        //take screenshot and store as a file format // interface TakesScreenshot and method getScreenshotAs
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // copy the screenshot to desired location using copyFile // method
        FileUtils.copyFile(src, new File ("C:/Users/Iryna_Albekova/Documents/autoscreenshots/google.png"));
        driver.quit();

    }
}
