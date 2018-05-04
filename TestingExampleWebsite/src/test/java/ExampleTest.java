import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import DressSite.Homepage;
import DressSite.PrintedDressPage;
import DressSite.SignInPage;

public class ExampleTest {

    private static WebDriver driver;
    	
    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Pulled\\TestingExampleWebsite\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void testSeleniumSearch() {
    	
    	driver.get("http://automationpractice.com/index.php");
    	Homepage page = PageFactory.initElements(driver, Homepage.class);
    	page.homepageSearch(driver, "Selenium");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
    	assertEquals("No results were found for your search \"Selenium\"", element.getText());
    }
    
    @Test
    public void testClickWomen() {
    	
    	driver.get("http://automationpractice.com/index.php");
    	Homepage page = PageFactory.initElements(driver, Homepage.class);
    	page.homepageWomenButton(driver);
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/div/p[2]"));
    	assertEquals("This category includes all the basics of your wardrobe and much more:", element.getText());
    }
    
    @Test
    public void testSignInFail() {
    	driver.get("http://automationpractice.com/index.php");
    	SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    	Homepage HomePage = PageFactory.initElements(driver, Homepage.class);
    	HomePage.homepageSignIn(driver);
    	signInPage.signInPageTypeEmail(driver, "yes yes");
    	signInPage.SignInPageSignInButton(driver);
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
    	assertEquals("Invalid email address.", element.getText());
    }
    
//    @Test
//    public void testAddToCart() {
//    	driver.get("http://automationpractice.com/index.php?id_product=3&controller=product");
//    	PrintedDressPage printedDressPage = PageFactory.initElements(driver, PrintedDressPage.class);
//    	printedDressPage.AddToCartButton(driver);
//    	printedDressPage.ClosePopUp(driver);
//    	
//    	WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]"));
//    	assertEquals("1", element.getText());
//    }
}
