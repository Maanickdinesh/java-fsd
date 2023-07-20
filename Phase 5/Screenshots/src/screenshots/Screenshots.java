package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// get page screenshot
		File firstSrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileHandler.copy(firstSrc, dest);
		
		//driver.quit();
	}
}