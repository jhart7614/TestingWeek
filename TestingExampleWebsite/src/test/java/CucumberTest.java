import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import DemoSite.ExcelUtils;
import DressSite.Constant;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:")
public class CucumberTest {
	
	private static WebDriver driver;
	ExtentTest testReport;

	@BeforeClass
    public static void setUp(){
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Pulled\\TestingExampleWebsite\\chromedriver.exe");
        driver = new ChromeDriver();
        
        
}
}
