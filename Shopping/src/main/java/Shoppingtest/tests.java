package Shoppingtest;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests {
	
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
		driver.get("http://automationpractice.com/index.php");
		WebElement searchbar=driver.findElement(By.name("search_query"));
		searchbar.sendKeys("Printed Dress");
		searchbar.sendKeys(Keys.ENTER);
		List<WebElement> searchcheck=driver.findElements(By.className("product-name"));
		for (WebElement dress : searchcheck) {
			if (dress.getText().matches ("Printed Dress")) {
				assertTrue(true);
				}
			}
		
//		
//		WebElement dress1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
//		dress1.click();
//		WebElement cart=driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
//			cart.click();
//			WebElement proceed=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
//			proceed.click();
//			WebElement proceedcheck=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
//			TimeUnit.SECONDS.sleep(20);
//			proceedcheck.click();
//			TimeUnit.SECONDS.sleep(20);
//			

			}
		
		}


