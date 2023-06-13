package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    static public WebDriver driver;
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0); // if frame available- 0 because of 1 frame is there if no need to check which on eor test 0,1,2 etc

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .release()
                .build()
                .perform();
        driver.quit();

    }
}
