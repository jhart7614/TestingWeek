import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DemoSite.AddUserPage;
import DemoSite.ExcelUtils;
import DemoSite.LoginPage;
import DressSite.Constant;

public class DDT {
	
	ExtentReports report = new ExtentReports(
			"C:\\Users\\Admin\\Desktop\\Pulled\\TestingExampleWebsite\\ExcelUtilsDemoTestReport.html", true);
	
	private static WebDriver driver;
	ExtentTest testReport;

	@BeforeClass
    public static void setUp(){
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, 0);
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Pulled\\TestingExampleWebsite\\chromedriver.exe");
        driver = new ChromeDriver();
    }

	@Test
	public void excelTest() throws InterruptedException, IOException {
		
		FileInputStream file = new FileInputStream (Constant.Path_TestData + Constant.File_TestData);
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    XSSFCell cell = sheet.getRow(0).getCell(0);
	    
	    for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
	    	
	    	testReport = report.startTest("Excel Data Test: " + i);

	    	XSSFCell username = sheet.getRow(i).getCell(0);
	    	XSSFCell password = sheet.getRow(i).getCell(1);

			String user = username.getStringCellValue();
			String pass = password.getStringCellValue();
			
			driver.get(Constant.URL1);
			
			AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			
			addUserPage.typeUser(driver, user);
			testReport.log(LogStatus.INFO, "Input Username");
			addUserPage.typePassword(driver, pass);
			testReport.log(LogStatus.INFO, "Input Password");
			addUserPage.saveNewUser(driver);
			testReport.log(LogStatus.INFO, "Save User");
			
			driver.get(Constant.URL2);
			
			loginPage.typeUser(driver, user);
			testReport.log(LogStatus.INFO, "Login With Username");
			loginPage.typePassword(driver, pass);
			testReport.log(LogStatus.INFO, "Login With Password");
			loginPage.saveNewUser(driver);
			testReport.log(LogStatus.INFO, "Login");
			
			WebElement element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
	    	assertEquals("**Successful Login**", element.getText());
	    	testReport.log(LogStatus.PASS, "Login Test");
	    	ExcelUtils.setCellData("Pass", i, 2);
			
	}
	    report.endTest(testReport);
		report.flush();
}
}
