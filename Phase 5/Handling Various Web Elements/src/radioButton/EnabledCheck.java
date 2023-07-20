package radioButton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EnabledCheck {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.findElement(By.linkText("Mobiles")).click();
	    System.out.println("The Output of the IsEnabled " +
	            driver.findElement(By.linkText("Mobiles")).isEnabled());
	}

}