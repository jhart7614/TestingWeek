import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Cucumber.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CucumberSteps {
	
	private static WebDriver driver;
	private User myUser = new User();
	
	@Given("^the name of a user$")
	public void the_name_of_a_user() {
			
	}
	
	@When("^I type this name into the search box$")
	public void I_type_this_name_into_the_search_box() {
		myUser.login(driver, "Admin", "admin");
		myUser.adminButton(driver);
		myUser.searchName(driver, "Hamidi");
	}

}

