package button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusCheck {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver",
        		"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.lambdatest.com/");

        // Find the element by link text
        WebElement link = driver.findElement(By.linkText("Login"));

        // Check if the element is enabled
        System.out.println(link.isEnabled());

        // Close the browser
        driver.quit();
    }
}
