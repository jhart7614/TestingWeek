package DressSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintedDressPage {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement button;
	
	public void AddToCartButton(WebDriver driver) {
		this.driver = driver;
		button.click();
	}
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	private WebElement button2;
	
	public void ClosePopUp(WebDriver driver) {
		this.driver = driver;
		button2.click();
	}
}
