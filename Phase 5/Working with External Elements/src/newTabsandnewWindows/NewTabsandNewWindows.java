package newTabsandnewWindows;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabsandNewWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
		
		// Opening a new tab and navigating to a website
		WebDriver driver = new ChromeDriver();
		((JavascriptExecutor) driver).executeScript("window.open('https://www.example.com/', '_blank');");
		// Switch to the newly opened tab
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		// Optionally, you can navigate to another URL in the new tab
		driver.get("https://www.google.com/");
		
		// Opening a new window and navigating to a website
		WebDriver driver1 = new ChromeDriver();
		((JavascriptExecutor) driver1).executeScript("window.open('https://www.bing.com/', '_blank');");
		// Switch to the newly opened window
		driver1.switchTo().window(driver1.getWindowHandles().toArray()[1].toString());
		// Optionally, you can navigate to another URL in the new window
		driver1.get("https://www.yahoo.com/");
	}
}
