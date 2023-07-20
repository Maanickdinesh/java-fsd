package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
public static void main(String[] args) {
	//register the Chrome driver
	System.setProperty("webdriver.chrome.driver","D:\\Working Software\\Salenium\\seleniumjars\\chromedriver.exe");
	//create an obj to the driver -obj to the browser
	WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
	//maximize the screen
	wd.manage().window().maximize();
	//web URL 
	wd.get("http://127.0.0.1:5500/studentlogin/register.html");
	
	wd.findElement(By.name("student_name")).sendKeys("Dinesh");
	//close the browser
	//wd.close();
	
}
}
