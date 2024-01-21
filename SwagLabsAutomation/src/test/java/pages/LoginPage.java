package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginbtn;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement error;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String userid, String pwd) {
		username.sendKeys(userid);
		password.sendKeys(pwd);
		loginbtn.click();

	}

	public String getElementText() {
		return error.getText();
	}

}
