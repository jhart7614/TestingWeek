package dresssite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

WebDriver driver;
	
	@FindBy(name = "search_query")
	private WebElement searchBox;
	
	public void homepageSearch(WebDriver driver, String text) {
		this.driver = driver;
		searchBox.sendKeys(text);
		searchBox.submit();
	}
}
