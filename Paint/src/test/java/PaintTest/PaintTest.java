package PaintTest;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaintTest {
	
	 public static WebDriver driver;
		
		@BeforeClass
		public static void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver= new ChromeDriver();	
		
		
		}

		@AfterClass
		public static void teardown() {
			driver.quit();
		}
		
		@Test
		public void demoTest() throws Throwable {
			driver.manage().window().maximize();
			driver.get("https://www.youidraw.com/apps/painter/");
			WebElement paintbrush=driver.findElement(By.xpath("//*[@id=\"brush\"]"));
			paintbrush.click();
			WebElement canvas=driver.findElement(By.xpath("//*[@id=\"catch\"]"));
			canvas.click();
			Actions actions = new Actions(driver);
	     	actions.moveByOffset(-300,-200).clickAndHold().moveByOffset(150,0).moveByOffset(-75, 0).moveByOffset(0,300).release().perform();
	     	actions.moveByOffset(100, 0).clickAndHold().moveByOffset(145,-300).clickAndHold().moveByOffset(145,300).release().perform();
	     	actions.moveByOffset(-250, -100).clickAndHold().moveByOffset(200,0).release().perform();
	     	TimeUnit.SECONDS.sleep(10);
	     	
		
			
			
			
		
			
		}
		
	
		
		

}



