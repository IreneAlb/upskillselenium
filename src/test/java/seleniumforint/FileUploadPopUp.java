package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
    //static public WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Iryna_Albekova\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Iryna_Albekova\\Documents\\doctest.docx");




    }
}
