package seleniumforint;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
    static public WebDriver driver;
    public static void main(String[] args) throws InterruptedException { // throws added after adding thread.sleep by suggestion
       //System.setProperty("webdriver.chrome.driver", "/C/Users/Iryna_Albekova/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launching chrome
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);// 5s wait - added to class throws InterruptedException  - sleep after clicking - waiting but sleep is bad option, usually excplisit/implicit wait?

        Alert alert = driver.switchTo().alert(); // it switch from main layer page to pop up layer so control is there now with help of aler class and switchto
        System.out.println(alert.getText()); // print out text on pop up
        String text = alert.getText();
        if(text.equals("Please enter a valid user name")){
            System.out.println("correct alert message");
        }
        else {
            System.out.println("incorrect alert message");
        }

        alert.accept(); // click on ok button

        //alert.dismiss(); // clikc on cancel button

        driver.quit();
    }
}
