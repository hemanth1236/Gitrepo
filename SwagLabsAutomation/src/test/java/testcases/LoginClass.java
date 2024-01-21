package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class LoginClass extends BaseClass {
	@Test
	public void LoginFailure() {
		String username = "hemanth";
		String password = "password";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(username, password);
		String actualmsg = loginpage.getElementText();
		String expmsg = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualmsg, expmsg);
	}

	@Test
	public void LoginSuccess() {
		String exptitle = "Products";
		String username = "standard_user";
		String password = "secret_sauce";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(username, password);
		ProductPage pageprod = new ProductPage(driver);
		String title = pageprod.getTitle();
		Assert.assertEquals(title, exptitle);
	}

	@Test
	public void AddToCart() {
		String username = "standard_user";
		String password = "secret_sauce";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(username, password);
		String productname = "Sauce Labs Bike Light";
		ProductPage pageprod = new ProductPage(driver);
		pageprod.Add(productname);

	}

}
