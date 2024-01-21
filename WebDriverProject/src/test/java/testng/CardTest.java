package testng;

import org.testng.annotations.Test;

public class CardTest extends BaseClass {

	@Test(groups = { "sanity" })
	public void TC00_CreditCardTest() {
		System.out.println("this is credit card test");
	}

}
