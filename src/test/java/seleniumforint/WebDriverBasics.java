package seleniumforint;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverBasics {
    static public WebDriver driver;
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Iryna_Albekova\\IEDriverServer.exe");
        // launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }
}
