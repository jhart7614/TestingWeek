package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage {
	
	WebDriver driver;
	Actions action;
		
	@FindBy(xpath = "//*[@id=\"draggableview\"]/p")
	private WebElement drag;
	
	public void dragToBox(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
		action.dragAndDropBy(drag, 130, 0).perform();
	}
}
