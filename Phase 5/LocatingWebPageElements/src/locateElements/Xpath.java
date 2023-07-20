package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("http://127.0.0.1:5500/studentlogin/register.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Send keys to input fields using XPath

        // Student Name
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Dinesh");

        // Student ID
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input")).sendKeys("12345");
        
        // Student Mail
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("dinesh@gmail.com");

        // Student Password
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("password123");

        // Close the browser
        //driver.quit();
    }
}
