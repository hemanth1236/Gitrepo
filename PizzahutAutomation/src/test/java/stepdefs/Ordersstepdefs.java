package stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ordersstepdefs {

	WebDriver driver = BaseClass.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.pizzahut.co.in/");
	}

	@When("I enter the location as {string}")
	public void i_enter_the_location_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Location = driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']"));
		Location.sendKeys("Pune");

	}

	@When("I select the very first suggestion from the list")
	public void i_select_the_very_first_suggestion_from_the_list() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		WebElement Place = driver.findElement(By.xpath("//*[contains(text(),'Pune Railway Station')]"));
		Place.click();
		Thread.sleep(5000);

	}

	@Then("I should land on the Deals page")
	public void i_should_land_on_the_Deals_page() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Deals = driver.findElement(By.xpath("//a[@data-synth='link--deals--side']//span[text()='Deals']"));
		Assert.assertTrue(Deals.isDisplayed());
	}

	@Then("I select the tab as {string}")
	public void i_select_the_tab_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Pizzas = driver
				.findElement(By.xpath("//a[@data-synth='link--pizzas--side']//span[text()='Pizzas']"));
		Pizzas.click();
	}

	@Then("I select the pizza as {string}")
	public void i_select_the_pizza_as(String myPizza) {
		// Write code here that turns the phrase above into concrete actions

		WebElement MyPizza = driver
				.findElement(By.xpath("//div[text()='" + myPizza + "']//following::span[text()='Add'][1]"));
		MyPizza.click();

	}

	@Then("I should see the pizza is added to the cart")
	public void i_should_see_the_pizza_is_added_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		WebElement BaseketItem = driver.findElement(By.xpath(
				"//div[@data-testid='basket-item-product']//div[contains(text(),'Personal Schezwan Margherita')]"));
		Assert.assertTrue(BaseketItem.isDisplayed());
	}

	@Then("I click on the Checkout button")
	public void i_click_on_the_Checkout_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Checkout = driver.findElement(By.xpath("//div[@class='basket-checkout']//a"));
		Checkout.click();

	}

	@Then("I should be landed on the secured checkout page")
	public void i_should_be_landed_on_the_secured_checkout_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		WebElement Checkoutheader = driver.findElement(By.xpath("//a/preceding-sibling::span/span"));
		Assert.assertTrue(Checkoutheader.isDisplayed());

	}

	@Then("I enter the personal details")
	public void i_enter_the_personal_details(Map<String, String> map) {
		WebElement nameelement = driver.findElement(By.xpath("//input[@id='checkout__name']"));
		nameelement.sendKeys(map.get("Name"));

		WebElement mobileelement = driver.findElement(By.xpath("//input[@id='checkout__phone']"));
		mobileelement.sendKeys(map.get("Mobile"));

		WebElement emailelement = driver.findElement(By.xpath("//input[@id='checkout__email']"));
		emailelement.sendKeys(map.get("Email"));

	}

	@Then("I enter the address details")
	public void i_enter_the_address_details(List<String> list) {
		// Write code here that turns the phrase above into concrete actions
		WebElement addressdetails = driver.findElement(By.xpath("//input[@id='checkout__deliveryAddress.interior']"));
		addressdetails.sendKeys(list.get(0));

		WebElement addressline2 = driver.findElement(By.xpath("//input[@id='checkout__deliveryAddress.notes']"));
		addressline2.sendKeys(list.get(1));

	}

	@Then("I should see three payment options")
	public void i_should_see_three_payment_options(List<String> list) {
		// Write code here that turns the phrase above into concrete actions
		String str2;
		for (String str : list) {
			str2 = driver.findElement(By.xpath("//span[@class='mr-auto flex items-center']/span[text()='" + str + "']"))
					.getText();
			if (str.equals(str2)) {
				continue;
			} else {
				Assert.fail();
			}
		}

	}

	@Then("I select the payment option as {string}")
	public void i_select_the_payment_option_as(String string) {
		// Write code here that turns the phrase above into concrete actions

		WebElement option = driver
				.findElement(By.xpath("//span[@class='mr-auto flex items-center']/span[text()='" + string + "']"));
		option.click();

	}

}
