package phpTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {
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
	public void demoTest() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net");
		WebElement searchBar=driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a/span[1]"));
		searchBar.click();
		searchBar.sendKeys("London");
		searchBar.sendKeys("London");
//		WebElement londonLink;
////		londonLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
////		londonLink.click();
		
		
		
//		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
//		searchBar.sendKeys(Keys.ENTER);
//		
		
		//https://www.phptravels.net/hotels/search/united-kingdom/london/29-05-2019/31-05-2019/3/0
	
}
}

