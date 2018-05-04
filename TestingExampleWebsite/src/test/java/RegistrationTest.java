import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import demoqa.Registration;

public class RegistrationTest {

	 private static WebDriver driver;
 	
	    @BeforeClass
	    public static void setUp(){
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Pulled\\TestingExampleWebsite\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }
	    
	    @Test
	    public void registrationTest() {
	    	
	    	driver.get("http://demoqa.com/registration/");
	    	Registration registrationPage = PageFactory.initElements(driver, Registration.class);
	    	registrationPage.typeFirstName(driver, "Jim");
	    	registrationPage.typeLastName(driver, "John");
	    	registrationPage.singleButton(driver);
	    	registrationPage.danceButton(driver);
	    	registrationPage.countryDropDown(driver);
	    	registrationPage.selectUK(driver);
	    	registrationPage.monthDropDown(driver);
	    	registrationPage.selectMonth2(driver);
	    	registrationPage.dayDropDown(driver);
	    	registrationPage.selectDay2(driver);
	    	registrationPage.restOfFields(driver, "09999999999", "johm", "john5555@gmail.com", "yoyoyoyoyoyo");
	    	
	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"post-49\"]/div/p"));
	    	assertEquals("Thank you for your registration", element.getText());
}
}
