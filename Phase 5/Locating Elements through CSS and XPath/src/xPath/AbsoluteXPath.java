package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
    public static void main(String[] args) {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.amazon.in/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Absolute XPath
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[13]/div[2]/div/a ")).click();

        // Close the browser
       // driver.quit();
    }
}
