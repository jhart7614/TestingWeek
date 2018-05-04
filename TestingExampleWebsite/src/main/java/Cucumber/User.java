package Cucumber;

import java.util.Stack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DressSite.Homepage;

public class User {

	WebDriver driver;
	Actions action;
	
	@FindBy(id = "txtUsername")
	private WebElement login;
	
	public void login(WebDriver driver, String username, String password) {
		this.driver = driver;
		this.action = action;
		login.sendKeys(username);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(password);
}
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b")
	private WebElement adminButton;
	
	public void adminButton(WebDriver driver) {
		this.driver = driver;
		adminButton.click();
	}
	
	@FindBy(xpath = "//*[@id=\"searchSystemUser_userName\"]")
	private WebElement searchName;
	
	public void searchName(WebDriver driver, String text) {
		this.driver = driver;
		searchName.sendKeys(text);
		searchName.submit();
	}
}
