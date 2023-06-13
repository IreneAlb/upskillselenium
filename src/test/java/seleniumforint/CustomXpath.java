package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomXpath {
    static public WebDriver driver;
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("iphonne14");// searchfield by element
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("robot"); // same by another element available
        driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("iphone 14"); // by contains


        // contains and dynamic ids or dynamic values
        // id = test_123
        //By.id("test_123")
        //id = test_456
        //id = test_789  - after page refreshing as example
        //id=test_test_7890_test // lets say id changed as dynamic so checking by starts-with test_


        // but if other way
        //123_test_t
        //456_test_t - then - enda-with
   // dyna,ic and contains example
       // driver.findElement(By.xpath("//input[contains(@id),'test_']")).sendKeys("Test");

        // dynamic id and starts-with when value only at the beginning
       // driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
        //driver.findElement(By.xpath("//input[ends-with(@id, '_test_t')]")).sendKeys("test");


        //link - all links represented with a tag
        // issues with absolute xpath where //input/div/div2 -means lovcation on page ---issues: performance, not reliable as element place could be change so xpath will not work anymore

      //  driver.findElement(By.xpath("//a[contains(text(), 'My eBay')]")).click();
    }
}
