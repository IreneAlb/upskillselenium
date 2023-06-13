package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropBox {
    static public WebDriver driver; // instead of system properties
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.get("https://portalpacjenta.luxmed.pl/PatientPortal/NewPortal/Page/Account/Create");
    // handle dropbox dropdown
        Select select = new Select (driver.findElement(By.id("flaga")));
        select.selectByVisibleText("English"); // but need to retry which options working for which dropdowns
    }
}
