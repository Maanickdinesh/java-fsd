package dropdownList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver",
        		"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/studentlogin/register.html");

        // Puts an implicit wait, will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Selecting an item from the dropdown list box
        Select dropdown = new Select(driver.findElement(By.id("student_subjects")));
        //dropdown.selectByIndex(2);
dropdown.selectByValue("english");
        // You can also use dropdown.selectByIndex(1) to select the second element as
        // the index starts with 0.
        



//retrieves the "selected" status of the dropdown element.
        System.out.println("The Output of the IsSelected " +
                driver.findElement(By.id("student_subjects")).isSelected());
      //  retrieves the "enabled" status of the dropdown element.
        System.out.println("The Output of the IsEnabled " +
                driver.findElement(By.id("student_subjects")).isEnabled());
        //retrieves the "displayed" status of the dropdown element.
        System.out.println("The Output of the IsDisplayed " +
                driver.findElement(By.id("student_subjects")).isDisplayed());
        // retrieves the size (width and height) of the dropdown element.
        System.out.println("The Output of the Size " +
                driver.findElement(By.id("student_subjects")).getSize());

        // Close the browser
      //  driver.quit();
    }
}
