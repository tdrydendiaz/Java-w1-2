package FirstExcelTest;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Consts.Constants;;

public class DemositeTest {
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
	public void first() throws Throwable {
		
	FileInputStream file = null;
	try {
		file = new FileInputStream (Constants.Path_TestData +Constants.File_TestData);
	} catch (FileNotFoundException e) {System.out.println(Constants.Path_TestData +Constants.File_TestData);}
	
		XSSFWorkbook workbook = null;
		try { 
			workbook = new XSSFWorkbook(file);
		}
		catch (IOException e) {}
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell cell = sheet.getRow(0).getCell(0);
		System.out.println(cell.getStringCellValue());
		 
	
		for (int i=1; i<5; i++) {
			cell = sheet.getRow(i).getCell(0);
			String user = (cell.getStringCellValue());
			System.out.println(user);
			cell = sheet.getRow(i).getCell(1);
			String password = (cell.getStringCellValue());
			System.out.println(password);
			System.out.println(demoTest(user,password));
			
			cell=sheet.getRow(i).createCell(2);
			cell.setCellValue(demoTest(user,password));
		}
			
		try {
			FileOutputStream out=new FileOutputStream(new File (Constants.Path_TestData+Constants.File_TestData));
			workbook.write(out);
			out.close();
			System.out.println("File saved without issue");
		} catch (IOException e) {
			System.out.println("Errors");
		}
	}

	
	public String demoTest(String user, String password) throws Exception {
		
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/login.php");
		
//		WebElement login=driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
//		login.click();
		WebElement tryName=driver.findElement(By.name("username"));
		tryName.sendKeys(user);
		WebElement tryPassword=driver.findElement(By.name("password"));
		tryPassword.sendKeys(password); 
		WebElement login1=driver.findElement(By.name("FormsButton2"));
		login1.click();
		WebElement success=driver.findElement(By.xpath("/html/body/"
				+ "table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		if (success.getText().equals("Successful Login"))
			return ("True");
		 else return ("False");
		}		
}

	
		
		
	
		
		
	
