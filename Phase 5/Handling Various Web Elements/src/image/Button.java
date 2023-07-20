package image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// Below code will locate the images and click on images.
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();

		System.out.println("Clicked successfully");
		
		// Close the browser
		driver.quit();
	}

}
