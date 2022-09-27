package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog1 {

public static void main(String[] args) throws Exception {
			
	   System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelleniumPrograms\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.trello.com/home");
			Thread.sleep(1000);
       
	      driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("kordebhavesh786@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bhavesh@123");
            driver.findElement(By.xpath("//span[text()='Log in']")).click();
        	Thread.sleep(2500);
            driver.findElement(By.xpath("//p[text()='Create']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Create board']")).click();
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sample Board");
            driver.findElement(By.xpath("//button[text()='Create']")).click();
            Thread.sleep(2500);     
            driver.findElement(By.xpath("//span[text()='Add another list']")).click();
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("List A");
            driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
            driver.findElement(By.xpath("(//span[text()='Add a card'])[4]")).click();
            driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Sample Card");
            driver.findElement(By.xpath("//input[@value='Add card']")).click();
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("List B");
            driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
            
            WebElement sampleCard = driver.findElement(By.xpath("//span[text()='Sample Card']"));
            WebElement target = driver.findElement(By.xpath("(//span[text()='Add a card'])[5]"));
             Actions a = new Actions(driver);
             a.moveToElement(sampleCard).dragAndDrop(sampleCard, target).build().perform();
                    
            driver.findElement(By.xpath("//span[@title='kordebhavesh786 (kordebhavesh786)']")).click();
     
            Point p=target.getLocation();
            int x=p.getX();
            int y=p.getY();
            System.out.println("X co-ordinate="+x);
            System.out.println("Y co-ordinate="+y);
            
            driver.findElement(By.xpath("//span[text()='Log out']")).click();
            driver.findElement(By.xpath("//span[text()='Log out']")).click();
            
            driver.quit();
	}
}
