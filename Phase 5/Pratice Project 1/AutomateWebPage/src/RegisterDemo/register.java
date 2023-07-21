package RegisterDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class register {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver",
                "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://nxtgenaiacademy.com/demo-site/");

        // Maximize the browser window
        driver.manage().window().maximize();
        
        //by id 
        driver.findElement(By.id("vfb-5")).sendKeys("Dinesh");
        
        //by id
        driver.findElement(By.id("vfb-7")).sendKeys("Kumar");
        
        //by name
        driver.findElement(By.name("vfb-31")).click();
        
        // by cssselector
       
        driver.findElement(By.cssSelector("input#vfb-13-address")).sendKeys("Dubai MainRoad"); 
        driver.findElement(By.cssSelector("input#vfb-13-address-2")).sendKeys("No 6 Vevekanantha Street ");   
        driver.findElement(By.cssSelector("input#vfb-13-state")).sendKeys("Dubai kurukusanthu");  
        driver.findElement(By.cssSelector("input#vfb-13-zip")).sendKeys("Dubai ");   
        
        
     // Find the dropdown element and click on it
        WebElement dropdownElement = driver.findElement(By.className("select2-selection__arrow"));
        dropdownElement.click();

        // Wait for the dropdown options to be visible
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-results__option")));

        // Find the option by its text and click on it
        WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Saudi Arabia')]"));
        option.click();
        
        //absolute xpath
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section/div/div[1]/div/div/div/div/div/form/fieldset[1]/ul/li[5]/input")).sendKeys("vadivel@gmail.com");
        
        
     // Find the date input field by its ID
        WebElement dateInput = driver.findElement(By.id("vfb-18"));

        // Clear any existing value in the field (optional)
        dateInput.clear();

        // Enter the desired date in the format "MM/DD/YY"
        String desiredDate = "07/19/23";
        dateInput.sendKeys(desiredDate);
        
      //Relative Xpath
        
        driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("956749789");
        
     // Find the checkbox element by its ID or any other suitable locator
        WebElement checkbox = driver.findElement(By.id("vfb-20-0"));

        // Check if the checkbox is not selected and then select it
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        WebElement checkbox2 = driver.findElement(By.id("vfb-20-3"));

        // Check if the checkbox is not selected and then select it
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }
        
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section/div/div[1]/div/div/div/div/div/form/fieldset[1]/ul/li[10]/div/textarea")).sendKeys(" I am your Best Friend okey! ");
        
        driver.findElement(By.id("vfb-3")).sendKeys("99");
        //relative xpath
        driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
    }
}