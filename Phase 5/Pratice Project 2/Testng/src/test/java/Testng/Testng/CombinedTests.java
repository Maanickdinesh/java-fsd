package Testng.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class CombinedTests {
    private WebDriver wd;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
        wd = new ChromeDriver();
    }

    @Test(priority = 1)
    public void addToCartTest() {
        wd.get("https://cupsofmagik.com/");
        wd.manage().window().maximize();
        WebElement AddCartBut = wd.findElement(By.id("AddToCart-1608048234b059c376"));
        AddCartBut.click();
    }

    @Test(priority = 2)
    public void googleSearchTest() {
        wd.get("https://google.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2).getSeconds(), TimeUnit.SECONDS);
        WebElement textField = wd.findElement(By.name("q"));
        textField.sendKeys("What is Testing?");
        WebElement btnRef = wd.findElement(By.name("btnK"));
        btnRef.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test(priority = 3)
    public void loginTest() {
        // Open the website
        wd.get("https://www.saucedemo.com/");

        // Perform login
        wd.findElement(By.name("user-name")).sendKeys("standard_user");
        wd.findElement(By.id("password")).sendKeys("secret_sauce");
        wd.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
    }

    @Test(priority = 4)
    public void registrationTest() {
        wd.get("https://nxtgenaiacademy.com/demo-site/");

        // Registration form
        wd.findElement(By.id("vfb-5")).sendKeys("Dinesh");
        wd.findElement(By.id("vfb-7")).sendKeys("Kumar");
        wd.findElement(By.name("vfb-31")).click();

        // Address
        wd.findElement(By.cssSelector("input#vfb-13-address")).sendKeys("Dubai MainRoad");
        wd.findElement(By.cssSelector("input#vfb-13-address-2")).sendKeys("No 6 Vevekanantha Street ");
        wd.findElement(By.cssSelector("input#vfb-13-state")).sendKeys("Dubai kurukusanthu");
        wd.findElement(By.cssSelector("input#vfb-13-zip")).sendKeys("Dubai ");

        // Country
        WebElement dropdownElement = wd.findElement(By.className("select2-selection__arrow"));
        dropdownElement.click();
        WebElement option = wd.findElement(By.xpath("//li[contains(text(),'Saudi Arabia')]"));
        option.click();

        // Email
        wd.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section/div/div[1]/div/div/div/div/div/form/fieldset[1]/ul/li[5]/input")).sendKeys("vadivel@gmail.com");

        // Date
        WebElement dateInput = wd.findElement(By.id("vfb-18"));
        dateInput.clear();
        String desiredDate = "07/19/23";
        dateInput.sendKeys(desiredDate);

        // Phone
        wd.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("956749789");

        // Checkboxes
        WebElement checkbox1 = wd.findElement(By.id("vfb-20-0"));
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        WebElement checkbox2 = wd.findElement(By.id("vfb-20-3"));
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        // Additional Info
        wd.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section/div/div[1]/div/div/div/div/div/form/fieldset[1]/ul/li[10]/div/textarea")).sendKeys("I am your Best Friend okey!");

        // Age
        wd.findElement(By.id("vfb-3")).sendKeys("99");
        wd.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        wd.close();
    }
}
