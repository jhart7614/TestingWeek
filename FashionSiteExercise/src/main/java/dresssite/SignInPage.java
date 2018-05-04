package dresssite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

WebDriver driver;
	
	@FindBy(name = "search_query")
	private WebElement emailBox;
	
	public void homepageSearch(WebDriver driver, String text) {
		this.driver = driver;
		emailBox.sendKeys(text);
		emailBox.submit();
	}
	
}
