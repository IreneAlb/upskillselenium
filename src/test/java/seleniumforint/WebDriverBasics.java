package seleniumforint;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverBasics {
    static public WebDriver driver;
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Iryna_Albekova\\IEDriverServer.exe");

        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        System.out.println(title); // just printing title
        if (title.equals("Google")) {
            System.out.println("correct title"); //comparing
        } else {
            System.out.println("incorrect title");
        }
        System.out.println(driver.getCurrentUrl()); // printing current url
      //  System.out.println(driver.getPageSource()); // printing page source code - its right click- view page source
        driver.quit(); // quite driver

    }
}
