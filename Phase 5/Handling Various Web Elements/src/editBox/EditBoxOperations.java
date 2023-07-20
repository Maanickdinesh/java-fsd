package editBox;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxOperations {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Implicitly wait for 12 seconds
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // Launch the website
        driver.get("http://127.0.0.1:5500/studentlogin/register.html");

        // Enter a value in the edit box
        driver.findElement(By.name("student_name")).sendKeys("Selenium");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clear the value from the edit box
        driver.findElement(By.name("student_name")).clear();

        // Check if the edit box is enabled
        boolean isEnabled = driver.findElement(By.name("student_name")).isEnabled();
        System.out.println("Is the edit box enabled? " + isEnabled);

        // Check if the edit box exists
        boolean isPresent = driver.findElements(By.name("student_name")).size() > 0;
        System.out.println("Does the edit box exist? " + isPresent);

        // Get the value from the edit box
        String value = driver.findElement(By.name("student_name")).getAttribute("value");
        System.out.println("Value in the edit box: " + value);

        // Close the browser
        driver.quit();
    }
}
