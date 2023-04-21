package seleniumforint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/Iryna_Albekova/IEDriverServer.exe");

// Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

// Navigate to the web page that contains the file upload form
        driver.get("http://example.com");

// Find the file input element by ID
        WebElement fileInput = driver.findElement(By.id("fileInputId"));

// Enter the path of the file to be uploaded
        fileInput.sendKeys("path/to/file");

// Submit the file upload form
        fileInput.submit();

// Close the browser window
        driver.quit();
    }
}
