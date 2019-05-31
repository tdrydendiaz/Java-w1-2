package BDD;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paratest {
	public static WebDriver driver;
	
	@Before
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public static void teardown() {
		driver.quit();
	}
	
	
	
	@Given("^I go to \"([^\"]*)\" website$")
	
	public void i_go_to_website(String arg1) throws Throwable {
		driver.manage().window().maximize();
		driver.get(arg1);
		
	
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		WebElement search=driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		search.click();
		search.sendKeys(arg1);
	 
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
		WebElement results=driver.findElement(By.id("b_results"));
		assertTrue(results.isDisplayed());
	} 

}
