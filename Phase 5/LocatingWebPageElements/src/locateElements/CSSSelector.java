package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
    public static void main(String[] args) {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("http://127.0.0.1:5500/studentlogin/register.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Send keys to input fields

        // Student Name
        driver.findElement(By.cssSelector("input[name=student_name]")).sendKeys("Dinesh");

        // Student ID
        driver.findElement(By.cssSelector("input[name=student_id]")).sendKeys("12345");

        // Student Mail
        driver.findElement(By.cssSelector("input#email")).sendKeys("dinesh@gmail.com");

        // Student Password
        driver.findElement(By.cssSelector("input[name=student_password]")).sendKeys("password123");

        // Close the browser
       // driver.quit();
    }
}
