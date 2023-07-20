package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver",
                "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("http://127.0.0.1:5500/studentlogin/register.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Check if the checkbox is displayed
        WebElement checkbox = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input[1]"));
        boolean isDisplayed = checkbox.isDisplayed();
        System.out.println("Is checkbox displayed? " + isDisplayed);

        // Check if the checkbox is enabled
        boolean isEnabled = checkbox.isEnabled();
        System.out.println("Is checkbox enabled? " + isEnabled);

        // Check if the checkbox is selected
        boolean isSelected = checkbox.isSelected();
        System.out.println("Is checkbox selected? " + isSelected);

        // Select the checkbox
        if (!isSelected) {
            checkbox.click();
            System.out.println("Checkbox is selected now.");
        }

        // Unselect the checkbox
        if (isSelected) {
            checkbox.click();
            System.out.println("Checkbox is unselected now.");
        }

        // Close the browser
        driver.quit();
    }
}
