package cssSelector;
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
        
        // Tag and Attribute
        driver.findElement(By.cssSelector("input[name=student_name]")).sendKeys("Dinesh");
         


        // Tag and Class
         driver.findElement(By.cssSelector("input.student-id-input")).sendKeys("12345");
        // Tag and ID
        driver.findElement(By.cssSelector("input#email")).sendKeys("dinesh@gmail.com");

       

        // Tag, Class, and Attribute
        //driver.findElement(By.cssSelector("textarea.address-textarea[name=student_address]")).sendKeys("123 Main Street");
        driver.findElement(By.cssSelector("textarea.address-textarea[name='student_address']")).sendKeys("123 Main Street");


        // Inner text
        
        
       // driver.findElement(By.cssSelector("font:contains('Boston')")).click();
        //driver.findElement(By.cssSelector("button:contains('Submit')")).click();
       // driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        driver.findElements(By.cssSelector("tr input[type='submit'][value='Register']"))
        .forEach(element -> element.click());

        // Close the browser
        // driver.quit();
    }
}
