package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearField {
    static public WebDriver driver;
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebElement textField = driver.findElement(By.id("textFieldId"));

// Clear the text field
        textField.clear();

// Send new keys to the text field
        textField.sendKeys("New text");
    }
}
