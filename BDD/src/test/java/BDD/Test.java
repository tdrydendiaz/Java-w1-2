package BDD;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	public static WebDriver driver;

//	@Before
//	public static void setup() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//
//	@After
//	public static void teardown() {
//		driver.quit();
//	}

	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://www.practiceselenium.com/welcome.html");
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
		WebElement menu = driver
				.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
		menu.click();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
		WebElement tea = driver
				.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong"));
		if (tea.getText().matches("Tea")) {
			assertTrue(true);
		} else {
			fail();
		}
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
		WebElement checkout = driver
				.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a"));
		checkout.click();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
		WebElement success = driver.findElement(
				By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong"));
		if (success.getText().equals("Pay with Credit Card or Log In")) {
			assertTrue(true);
		} else {
			fail();
		}
	}
}
