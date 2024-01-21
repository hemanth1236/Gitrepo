package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import app.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	Calculator cal;
	int result = 0;

	@Given("I have the calculator")
	public void i_have_the_calculator() {
		// Write code here that turns the phrase above into concrete actions
		cal = new Calculator();

	}

	@When("I add two numbers {int} and {int}")
	public void i_add_two_numbers_and(int int1, int int2) {
		// Write code here that turns the phrase above into concrete actions
		result = cal.Add(int1, int2);
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expectedresult) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expectedresult, result);

	}

	@When("I substract two numbers {int} and {int}")
	public void i_substract_two_numbers_and(int int1, int int2) {
		// Write code here that turns the phrase above into concrete actions
		result = cal.Sub(int1, int2);
	}

	@When("I add the below numbers")
	public void i_add_the_below_numbers(List<Integer> numbers) {
		for (int num : numbers) {
			result = cal.Add(result, num);
		}

	}

	@When("I buy the below item at given price")
	public void i_buy_the_below_item_at_given_prize(Map<String, Integer> items) {
		// Write code here that turns the phrase above into concrete actions
		for (int value : items.values()) {
			result = cal.Add(result, value);
		}

	}

	@When("I buy the below items at given price and at given quantity")
	public void i_buy_the_below_items_at_given_price_and_at_given_quantity(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		int rows = dataTable.height();
		for (int i = 0; i < rows; i++) {
			int quantity = Integer.parseInt(dataTable.cell(i, 1));
			int price = Integer.parseInt(dataTable.cell(i, 2));
			result = cal.Add(quantity * price, result);
		}
	}
}
