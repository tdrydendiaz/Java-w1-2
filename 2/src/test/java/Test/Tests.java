package Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests{
  static WebDriver driver;
	
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
	public void methodTest() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk");
		WebElement checkElement=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		checkElement.sendKeys("Cute Kittens");
		checkElement.sendKeys(Keys.ENTER);
		WebElement KittensImages=driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
		KittensImages.click();
		TimeUnit.SECONDS.sleep(10);
		WebElement uniquekitty=driver.findElement(By.xpath("//*[@id=\"YP_V2ObNd6olQM:\"]"));
		assertTrue(uniquekitty.isDisplayed());

	}
	
	@Test
	public void methodTest2() {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk");
		driver.navigate().to("https://www.google.co.uk/search?q=cute+dogs&source=lnms&sa=X&ved=0ahUKEwis9eC1xcDiAhXbBGMBHZqSBcQQ_AUICSgA&biw=1365&bih=925&dpr=1");
	}	
	
	@Test
	public void methodTest3() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk");
		
	WebElement searchBox=driver.findElement(By.name("q"));
	searchBox.sendKeys(Keys.chord(Keys.SHIFT,"qa consulting"));
	TimeUnit.SECONDS.sleep(10);
	
	
}
}

