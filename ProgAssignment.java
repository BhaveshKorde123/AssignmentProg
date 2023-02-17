package Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgAssignment{

public static void main(String[] args) throws Exception {
	       
	        WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ipad");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    	driver.get("https://www.flipkart.com/search?q=ipad&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window.scroll(0,700)");
			driver.findElement(By.xpath("//div[text()='Connectivity']")).click();
			driver.findElement(By.xpath("//div[text()='Wi-Fi Only']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)']")).click();
			driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
			driver.get("https://www.flipkart.com/apple-ipad-9th-gen-64-gb-rom-10-2-inch-wi-fi-only-space-grey/p/itmd7d2c4840fa04?pid=TABG6VNCHTRZGN9N&lid=LSTTABG6VNCHTRZGN9NIK0OLT&marketplace=FLIPKART&q=ipad&store=tyy%2Fhry&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=6f363011-da7f-4af2-953f-ac725f87ac46.TABG6VNCHTRZGN9N.SEARCH&ppt=sp&ppn=sp&ssid=md1tg1v65c0000001676619850389&qH=09401fded433c347");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
			driver.get("https://www.flipkart.com/checkout/init?otracker=search");
			driver.get("https://www.flipkart.com/viewcart");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
			Thread.sleep(2000);
            driver.quit();
	}
}
