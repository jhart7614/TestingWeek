package DressSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	WebDriver driver;
	
	@FindBy(name = "email")
	private WebElement emailBox;
	
	public void signInPageTypeEmail(WebDriver driver, String text) {
		this.driver = driver;
		emailBox.sendKeys(text);
		emailBox.submit();
	}
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement button;
	
	public void SignInPageSignInButton(WebDriver driver) {
		this.driver = driver;
		button.click();
	}

}
