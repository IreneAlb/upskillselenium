package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
    static public WebDriver driver;
    public static void main(String[] args) throws InterruptedException { // except added when adding thread.sleep
       // System.setProperty("webdriver.chrome.driver", "/C/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.manage().window().maximize(); // maximize window
        driver.manage().deleteAllCookies(); // delete all the cookies

        // dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.freecrm.com/");
        driver.findElement(By.xpath("/html/body/div/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click(); // in general such xpath is bad as just telling place
        driver.findElement(By.name("email")).sendKeys("iryna_uafi@mail.ru");
        driver.findElement(By.name("password")).sendKeys("Him1313!");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        //driver.findElement(By.xpath(""))
        Thread.sleep(3000); // adding sleep added to static void method exception

        // if frame available // there could be a few frames like main pannel and left pannel etc.
       // driver.switchTo().frame("farme_name"); // frame name as main_panel need to be added
       // Thread.sleep(3000);
       //driver.findElement(By.xpath("//a[contains(text),'contacts']")).click(); // not working
       driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i")).click(); //copied
// if cant find element because frame - right click on menu there in frame option means frames are there and then clikc on page source - to see frames

    }
}
