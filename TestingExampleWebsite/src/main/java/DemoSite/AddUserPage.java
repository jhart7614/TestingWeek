package DemoSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {
	
	WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement userBox;
	
	public void typeUser(WebDriver driver, String text) {
		this.driver = driver;
		userBox.sendKeys(text);
		
	}
	@FindBy(name = "password")
	private WebElement passBox;
	
	public void typePassword(WebDriver driver, String text) {
		this.driver = driver;
		passBox.sendKeys(text);
		
	}
	
	@FindBy(name = "FormsButton2")
	private WebElement button;
	
	public void saveNewUser(WebDriver driver) {
		this.driver = driver;
		button.click();
	}

}
