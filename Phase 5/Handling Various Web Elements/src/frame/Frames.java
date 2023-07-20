package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("url with frames");
		
		// wait of 12 seconds
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
	    //grabbing the first frame with the help of index
	    driver.switchTo().frame(0);
	    
	    //grabbing the frame with the help of frame name
	    driver.switchTo().frame("<<name expression>>");
	    
	    //grabbing the frame with the help of frame webelement
	    WebElement name = driver.findElement(By.name("frame-right"));
	    driver.switchTo().frame(driver.findElement(By.name("<<name expression")));
	}

}
