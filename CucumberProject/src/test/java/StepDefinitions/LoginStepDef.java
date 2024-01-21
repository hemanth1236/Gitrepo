package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef {

	WebDriver driver = BaseClass.driver;

	@Given("I have launched the application URL")
	public void i_have_launched_the_application_URL() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://simplilearn.com/");
	}

	@Given("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@Then("I enter the username and password")
	public void i_enter_the_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.name("user_pwd"));
		Password.sendKeys("Abc@1234");
	}

	@Then("I click on the Login button")
	public void i_click_on_the_Login_button() {
		// Write code here that turns the phrase above into concrete actions

		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Then("I should land on the home screen")
	public void i_should_land_on_the_home_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(string);

		WebElement Password = driver.findElement(By.name("user_pwd"));
		Password.sendKeys(string2);

	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String expError) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.className("error_msg"));
		String ActError = Error.getText();
		Assert.assertEquals(expError, ActError);

	}

	@Then("I should see below login options on the screen")
	public void i_should_see_below_login_options_on_the_screen(List<String> Options) {
		// Write code here that turns the phrase above into concrete actions

		for (String option : Options) {

			WebElement LoginOption = driver.findElement(By.xpath("//button[@data-clickedtype='" + option + "']"));
			Assert.assertTrue(LoginOption.isDisplayed());
		}
	}

}
