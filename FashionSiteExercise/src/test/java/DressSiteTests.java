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

import dresssite.Constants;
import dresssite.HomePage;

public class DressSiteTests {

	ExtentReports report = new ExtentReports(
			"C:\\Users\\Admin\\Desktop\\TestingWeek\\FashionSiteExercise\\Report.html", true);
	
	private static WebDriver driver;
	ExtentTest testReport;
	
    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\TestingWeek\\TestingExampleWebsite\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void testSearchBlouse() {
    	testReport = report.startTest("Search Blouse Test");
    	
    	driver.get("http://automationpractice.com/index.php");
    	HomePage page = PageFactory.initElements(driver, HomePage.class);
    	page.homepageSearch(driver, "blouse");
    	testReport.log(LogStatus.INFO, "Search Blouse");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
    	assertEquals("Blouse", element.getText());
    	testReport.log(LogStatus.PASS, "Search Sucessful");
    	
    	report.endTest(testReport);
    	report.flush();
    }
    
    @Test
	public void createUserExcelTest() throws InterruptedException, IOException {
    	
    	FileInputStream file = new FileInputStream (Constants.Path_TestData + Constants.File_TestData);
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    XSSFCell cell = sheet.getRow(0).getCell(0);
	    
	    for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
    }

}
}
