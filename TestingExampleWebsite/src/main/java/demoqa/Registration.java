package demoqa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Registration {
	
	WebDriver driver;
	Actions action;

	@FindBy(name = "first_name")
	private WebElement firstName;
	
	public void typeFirstName(WebDriver driver, String text) {
		this.driver = driver;
		firstName.sendKeys(text);	
	}
	
	@FindBy(name = "last_name")
	private WebElement lastName;
	
	public void typeLastName(WebDriver driver, String text) {
		this.driver = driver;
		lastName.sendKeys(text);	
	}
	
	@FindBy(xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[3]")
	private WebElement divorced;
	
	public void divorcedButton(WebDriver driver) {
		this.driver = driver;
		divorced.click();
	}
	
	@FindBy(xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")
	private WebElement single;
	
	public void singleButton(WebDriver driver) {
		this.driver = driver;
		single.click();
	}
	
	@FindBy(xpath = "//*[@id=\\\"pie_register\\\"]/li[2]/div/div/input[2]")
	private WebElement married;
	
	public void marriedButton(WebDriver driver) {
		this.driver = driver;
		married.click();
	}
	
	@FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[1]")
	private WebElement dance;
	
	public void danceButton(WebDriver driver) {
		this.driver = driver;
		dance.click();
	}
	
	@FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]")
	private WebElement reading;
	
	public void readingButton(WebDriver driver) {
		this.driver = driver;
		reading.click();
	}
	
	@FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[3]")
	private WebElement cricket;
	
	public void cricketButton(WebDriver driver) {
		this.driver = driver;
		cricket.click();
	}
	
	@FindBy(xpath = "//*[@id=\"dropdown_7\"]")
	private WebElement countrydropdown;
	
	public void countryDropDown(WebDriver driver) {
		this.driver = driver;
		countrydropdown.click();
	}
	
	@FindBy(xpath = "//*[@id=\"dropdown_7\"]/option[192]")
	private WebElement uk;
	
	public void selectUK(WebDriver driver) {
		this.driver = driver;
		uk.click();
	}
	
	@FindBy(xpath = "//*[@id=\"mm_date_8\"]")
	private WebElement monthdropdown;
	
	public void monthDropDown(WebDriver driver) {
		this.driver = driver;
		monthdropdown.click();
	}
	
	@FindBy(xpath = "//*[@id=\"mm_date_8\"]/option[3]")
	private WebElement mtwo;
	
	public void selectMonth2(WebDriver driver) {
		this.driver = driver;
		mtwo.click();
	}
	
	@FindBy(xpath = "//*[@id=\"mm_date_8\"]")
	private WebElement daydropdown;
	
	public void dayDropDown(WebDriver driver) {
		this.driver = driver;
		daydropdown.click();
	}
	
	@FindBy(xpath = "//*[@id=\"mm_date_8\"]/option[3]")
	private WebElement dtwo;
	
	public void selectDay2(WebDriver driver) {
		this.driver = driver;
		dtwo.click();
	}
	
	@FindBy(xpath = "//*[@id=\"yy_date_8\"]")
	private WebElement yeardropdown;
	
	public void yearDropDown(WebDriver driver) {
		this.driver = driver;
		yeardropdown.click();
	}
	
	@FindBy(xpath = "//*[@id=\"yy_date_8\"]/option[15]")
	private WebElement y;
	
	public void selectYear2001(WebDriver driver) {
		this.driver = driver;
		y.click();
	}
	
	@FindBy(id = "phone_9")
	private WebElement phone;
	
	public void restOfFields(WebDriver driver, String num, String username, String email, String password) {
		this.driver = driver;
		this.action = new Actions(driver);
		phone.sendKeys(num);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(username);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(email);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(password);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(password);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	
	
}
