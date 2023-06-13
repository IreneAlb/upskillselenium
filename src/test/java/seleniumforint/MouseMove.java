package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class MouseMove {
    static public WebDriver driver;
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.spicejet.com/");

        Actions action = new Actions(driver); // Actions class for mouse over
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"))).build().perform(); // mouse overing/ no need to click over it
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[5]/div/a[1]/div/div")).click();
        driver.quit();

    }

}
