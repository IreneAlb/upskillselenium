package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        // 1. get the total cpunt of links on the page
        //2. get the text of each link on the page
        // ctrl +clik on findelements method shows its gives list of elements
        // all links represented by a tag
        List <WebElement> linklist = driver.findElements(By.tagName("a")); // find element not element will find all links on the page - method returns list of elements

       // size of linklist
        System.out.println(linklist.size()); // returning the number of elements (links - a)- see all methoods by ctrl+click on List
        // printing text for each link
        for (int i=0;i< linklist.size();i++){  // List has method size
         String linkText = linklist.get(i).getText(); // List has methods get and gettext
            System.out.println(linkText); // printing text for each link // blank results is links with no text
        }



    }
}
