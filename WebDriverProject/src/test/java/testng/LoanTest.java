package testng;

import org.testng.annotations.Test;

public class LoanTest extends BaseClass {

	@Test
	public void TC01_HomeLoanTest() {

		System.out.println("Inside HomeLoan");
	}

	@Test(enabled = false)
	public void TC02_CarLoanTest() {

		System.out.println("Inside CarLoan");
	}

	@Test(groups = { "sanity", "regression" })
	public void TC00_PersonalLoanTest() {

		System.out.println("Inside PersonalLoan");
	}

}
