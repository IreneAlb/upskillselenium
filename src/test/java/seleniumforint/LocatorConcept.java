package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
    static public WebDriver driver;
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.get("https://account.mail.ru/signup?from=main&rf=auth.mail.ru&app_id_mytracker=58519");
        //1. locator - xpath
        // absolute xpath should not be used - like html/body/div[1]/div[5]/a etc - ots location of element refering
        // only relative zpath should be used
        driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Arya");
       // driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Stark");
       // driver.findElement(By.xpath("//*[@id=\"aaa__input\"]")).sendKeys("user0101");
        //2. id
        driver.findElement(By.id("aaa__input")).sendKeys("user0202A");

        //3.name
       // driver.findElement(By.name("lname")).sendKeys("Stark");
    driver.findElement(By.name("lname"));
        //4. linktext  // for text before </a> - only for links
       // driver.findElement(By.linkText("Generate a strong password")).click();
       // driver.findElement(By.linkText("Registration")).click();


        //5. partial link text - not recommended to use
       // driver.findElement(By.partialLinkText("Terms of")).click();

        //6. css selector - if id is there - then #id
        //if class there --- .class
        driver.findElement(By.cssSelector("#password")).sendKeys("passqrqr2"); // #password - for css based on id its just #id


        //7. class name - not useful as could be duplicated for diff elements
       // driver.findElement(By.className("base-0-2-6 h6-0-2-13")).click();  // take value from class=""


    }
}
