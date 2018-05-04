package DressSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	WebDriver driver;
	
	@FindBy(name = "search_query")
	private WebElement searchBox;
	
	public void homepageSearch(WebDriver driver, String text) {
		this.driver = driver;
		searchBox.sendKeys(text);
		searchBox.submit();
	}
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement button;
	
	public void homepageWomenButton(WebDriver driver) {
		this.driver = driver;
		button.click();
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement button2;
	
	public void homepageSignIn(WebDriver driver) {
		this.driver = driver;
		button2.click();
	}
}
