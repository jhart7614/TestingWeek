import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import demoqa.DroppablePage;

public class MouseActionTests {

    private static WebDriver driver;
    	
    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Pulled\\TestingExampleWebsite\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void dragTest() {
    	
    	driver.get("http://demoqa.com/droppable/");
    	DroppablePage droppablePage = PageFactory.initElements(driver, DroppablePage.class);
    	droppablePage.dragToBox(driver);
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p"));
    	assertEquals("Dropped!", element.getText());
    }
    
}
