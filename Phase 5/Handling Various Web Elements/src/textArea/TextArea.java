package textArea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		// identify element
	    WebElement m = driver.findElement(By.id("user-name"));

	    // enter text
	    m.sendKeys("standard_user");

	    // obtain value entered in text area
	    System.out.println("Value entered: " + m.getAttribute("value"));

	    // clear text area
	    m.clear();

	    // obtain value entered in text area after clear applied
	    System.out.println("Value after clear(): " + m.getAttribute("value"));
	}

}
